import java.io.PrintWriter;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int N = sc.nextInt();
		int[] p = new int[N];
		for(int i=0; i<N; i++) p[i]=sc.nextInt();

		int ans = 0;
		for(int i=0; i<N-2; i++){
			if(p[i]<p[i+1] && p[i+1]<p[i+2] || p[i+2]<p[i+1]&&p[i+1]<p[i])ans++;
		}
		out.println(ans);

		out.flush();
	}
}

