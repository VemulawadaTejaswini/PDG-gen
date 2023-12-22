import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int[] sum = new int[N+1];
		for (int i=0;i<N;i++) {
			if (S.charAt(i)=='.') {
				sum[0]++;
			}
		}
		for (int i=1;i<N+1;i++) {
			if (S.charAt(i-1)=='#') {
				sum[i]=sum[i-1]+1;
			} else {
				sum[i]=sum[i-1]-1;
			}
		}
		Arrays.sort(sum);
		System.out.println(sum[0]);
	}
}