
import java.util.Scanner;

class Main{
	public static void main(String[] ag) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();

		if(A-B==B-C) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}