
import java.util.Scanner;

class Main{
	public static void main(String[] ag) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int D=sc.nextInt();

		int res=Math.max(Math.min(B, D)-Math.max(A, C), 0);
		System.out.println(res);
	}
}