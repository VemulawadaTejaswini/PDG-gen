//package atcoder;
 
import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//int n = 0;
		if(N<10) {
			int n = N;
			if(n==3) {
				System.out.println("bon");
			}
			if(n==0||n==1||n==6||n==8) {
				System.out.println("pon");
			}
			if(n==2||n==4||n==5||n==9) {
				System.out.println("hon");
			}
		}
		if(9<N) {
			int n = N%10;
			if(n==3) {
				System.out.println("bon");
			}
			if(n==0||n==1||n==6||n==8) {
				System.out.println("pon");
			}
			if(n==2||n==4||n==5||n==9) {
				System.out.println("hon");
			}
		}
		
		/*if(n==3) {
			System.out.println("bon");
		}
		if(n==0||n==1||n==6||n==8) {
			System.out.println("pon");
		}
		if(n==2||n==4||n==5||n==9) {
			System.out.println("hon");
		}*/
		
	}
}