import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int wTotal = 0;
		while(scan.hasNext()){
			int f = 0;
			int s = 0;
			int t = 0;
			for(int i = 0;i < 20;i++){
				int temp = scan.nextInt();
				if(i == 10){
					wTotal = f + s + t;
					f = temp;
					s = 0;
					t = 0;
				}else{
					if(temp > f){
						t = s;
						s = f;
						f = temp;
					}else if(temp > s){
						t = s;
						s = temp;
					}else if(temp > t){
						t = temp;
					}
				}
			}
			System.out.println(wTotal + " " + (f+s+t));
		}
	}
}