import java.util.Scanner;
public class Main {
	static int N;
	public static int dfs(int a) {
		if(a%3!=0&&a%5!=0) {
			return a;
		}
		else {
			return 0;
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		long ans=0;
		for(int i=0;i<N;i++) {
			ans+=dfs(N-i);
		}
		System.out.println(ans);
	}
}
