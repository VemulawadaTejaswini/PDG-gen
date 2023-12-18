import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int E = sc.nextInt();
		int[]x = new int[N+1];
		
		for(int i=1;i<=N;i++)x[i]=sc.nextInt();
		int res = -1;
		
		for(int i=1;i<=N&&res==-1;i++) {
			int k = (T-E-1)/x[i]+1;
			if(T-E<=x[i]*k && x[i]*k<=T+E)res=i;
		}
		System.out.println(res);
	}
}

