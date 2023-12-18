import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] A = new int[N];
		int cnt = 0;
		for(int i = 0;i < N;i++) {
			A[i] = Integer.parseInt(sc.next());
			if(A[i]%2!=0) {
				cnt++;
			}
		}
		sc.close();
		StringBuilder sb = new StringBuilder();
		if(cnt%2 == 0) {
			sb.append("YES");
		}else {
			sb.append("NO");
		}
		System.out.println(sb.toString());
	}
}