import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];

		ArrayList<int[]> list = new ArrayList<int[]>();
		int[] digit_sum = new int[30];
		for (int i=0;i<N;i++) {
			a[i] = sc.nextInt();
			int tmp = a[i];
			int[] digit = new int[30];
			for (int j=0;j<30;j++) {
				digit[j] = tmp%2;
				digit_sum[j] += digit[j];
				tmp/=2;
			}
			list.add(digit);
		}

		ArrayList<int[]> ans = new ArrayList<int[]>();
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<N;i++) {
			int[] digit = new int[30];
			for (int j=0;j<30;j++) {
				if (digit_sum[j]%2 == 0) {
					if (list.get(i)[j] == 1) {
						digit[j] = 1;
					} else { // list.get(i)[j] == 0
						digit[j] = 0;
					}
				} else { // digit_sum[j]%2 == 1
					if (list.get(i)[j] == 1) {
						digit[j] = 0;
					} else {
						digit[j] = 1;
					}
				}
			}
			long tmp = 0L;
			long val = 1L;
			for (int j=0;j<30;j++) {
				tmp += val*digit[j];
				val *= 2;
			}
			sb.append(tmp);
			if (i != N-1) sb.append(" ");
			ans.add(digit);
		}
		System.out.println(sb);
	}
}