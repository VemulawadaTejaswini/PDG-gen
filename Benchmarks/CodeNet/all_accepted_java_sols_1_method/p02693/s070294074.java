import java.util.Scanner;
	public class Main{
		public static void main(String args[]) {
			Scanner scan=new Scanner(System.in) ;
			int K=scan.nextInt();
			int A=scan.nextInt();
			int B=scan.nextInt();
			int num=0;
			int i=A/K;
			int j=i*K;
			for(int k=j;k<=B;k=k+K) {
				if(k>=A&&k<=B) {
					num=1;
					break;
				}
				else {}
			}
		if(num==0) {	
			System.out.println("NG");
		}
		else {System.out.println("OK");
		}
		}
	}
