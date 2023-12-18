import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	public void run(){
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			calc(n);
		}
	}
	public void calc(int n){
		String before = sc.next();
		int min = -1000010000;
		int max = 1000010000;
		int breakflug = 0;

		for(int i = 1; i < n; i++){
			String s = sc.next();
			if(breakflug == 0){
				if(s.equals("x")){
					if(before.equals("x")){//x???2??£?¶?????????????????????§?????????
						min = 0;
						max = 0;
						breakflug = 1;
					}
					else if(i%2 == 0){//?\???°??????
						int b = Integer.parseInt(before);
						if (b < max){
							max = b;
						}
					}
					else{//??¶??°??????
						int b = Integer.parseInt(before);
						if(b > min){
							min = b;
						}
					}
				}
				else{//??°????????´???
					int a = Integer.parseInt(s);
					if(before.equals("x")){//???????£???????????????¨???
						if(i%2 == 0){//x?????¶??°??????
							if(a > min){
								min = a;
							}	
						}
						else{//x????\???°??????
							if(a < max){
								max = a;
							}
						}
					}
					else{//????????°????????¨???
						int b = Integer.parseInt(before);
						if(i%2 == 0){//???????\???°??????
							if(b <= a){
								min = 0;
								max = 0;
								breakflug = 1;
							}
						}
						else{//????????¶??°??????
							if(b >= a){
								min = 0; 
								max = 0;
								breakflug = 1;
							}
						}
					}
				}
			}
			before = s;
		}
		
		if(max-min < 2){
			System.out.println("none");
		}
		else if(max-min == 2){
			System.out.println(max-1);
		}
		else{
			System.out.println("ambiguous");
		}
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}