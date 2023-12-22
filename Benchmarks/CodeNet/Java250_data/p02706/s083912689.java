import java.util.Scanner;
public class Main {
	static int N;
	static int M;
	static int[] A;
	public static int calc() {
		int ans=0;
		for(int i=0;i<M;i++) {
			ans+=A[i];
		}
		if(ans>N) {
			return -1;
		}
		else {
			return N-ans;
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		A=new int[M];
		for(int i=0;i<M;i++) {
			A[i]=sc.nextInt();
		}
		System.out.println(calc());
	}
}