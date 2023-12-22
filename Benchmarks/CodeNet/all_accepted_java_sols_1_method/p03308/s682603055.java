import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A[]=new int[N];
		
		for(int i=0;i<A.length;i++) {
			 A[i]=sc.nextInt();

		}
		Arrays.sort(A);
		int ans=A[A.length-1] - A[0];
		
		System.out.println(ans);
	}
}