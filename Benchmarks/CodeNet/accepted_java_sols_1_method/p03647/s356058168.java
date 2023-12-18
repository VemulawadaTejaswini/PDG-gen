import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		boolean[] to1 = new boolean[n];
		boolean[] ton = new boolean[n];

		for(int i=0;i<m;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a==1) {
				to1[b-1]=true;
			} else if (a==n) {
				ton[b-1]=true;
			} else if(b==1) {
				to1[a-1]=true;
			} else if(b==n) {
				ton[a-1]=true;
			}
		}
		boolean result = false;
		for(int j=0;j<n;j++) {
			if(to1[j] && ton [j]) {
				result=true;
			}
		}
		System.out.println(result ? "POSSIBLE" : "IMPOSSIBLE");

	}

}
