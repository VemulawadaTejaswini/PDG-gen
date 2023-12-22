import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int direct = x*a+y*b;
		int A = 0;
		int B = 0;
		int indirect = 0;
		if(x>y) {
			A = 2*y*c+(x-y)*a;
			indirect = Math.min(A, 2*x*c);
		}else {//
			B = 2*x*c+(y-x)*b;
			indirect = Math.min(B, 2*y*c);
		}	
		System.out.println(Math.min(direct, indirect));
	}
}