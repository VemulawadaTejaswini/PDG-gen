import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int q = in.nextInt();
		int[] p = new int[n+1];
		for(int i=0;i<q;i++) {
			int a = in.nextInt();
			p[a]++;
		}
		for(int i=1;i<=n;i++) {
			boolean ans = true;
			if(k-q+p[i]>0) ans = true;
			else ans = false;
			System.out.println(ans?"Yes":"No");
		}
		
		in.close();

	}

}
