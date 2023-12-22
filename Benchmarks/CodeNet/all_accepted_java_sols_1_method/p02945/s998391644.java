import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		sc.close();
		System.out.println(Math.max(A+B, Math.max(A-B, A*B)));
	}
}