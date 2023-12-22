import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int M=-1000000,m=1000000;
		long S = 0;

		for(int i = 1;i <= n;i++){
			int x = sc.nextInt();
			M = Math.max(M, x);
			m = Math.min(m, x);
			S = S+x;
		}
		System.out.println(m+" "+M+" "+S);
	}
}