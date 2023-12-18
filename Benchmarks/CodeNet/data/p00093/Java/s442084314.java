import java.util.Scanner;


public class Main {
	Scanner sc = new Scanner(System.in);
	
	boolean leap(int a){
		boolean leap = false;
		if(a%4==0) leap = true;
		if(a%100==0) leap = false;
		if(a%400==0) leap = true;
		return leap;
	}
	
	void run(){
		boolean init = true;
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int cnt = 0;
			if(a == 0 && b == 0){
				break;
			}
			
			if(init){
				init = false;
			}else{
				System.out.println();
			}
			
			for(;a<=b;a++){
				if(leap(a)){
					System.out.println(a);
					cnt++;
				}
			}
			
			if(cnt==0)
				System.out.println("NA");
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}