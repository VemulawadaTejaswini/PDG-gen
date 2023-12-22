import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] A=new int[N+1];
		int answer=0;
		for(int i=1;i<=N;i++) {
			A[i]=sc.nextInt();
			int d=1;
			while(A[i]%(int)Math.pow(2, d)==0) {
				d++;
			}
			answer=answer+d-1;
		}
		System.out.println(""+answer);

	}
}
