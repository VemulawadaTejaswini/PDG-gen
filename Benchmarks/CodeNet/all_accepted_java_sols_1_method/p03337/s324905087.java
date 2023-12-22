import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt(),B=sc.nextInt();
		int C=Math.max(A+B, A-B);
		int ans=Math.max(C, A*B);
		System.out.println(ans);
		
		
	}
}
