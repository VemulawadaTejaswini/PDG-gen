import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] m = new int[n];
		for (int i = 0; i < n; ++i) {
			m[i] = sc.nextInt();
		}

		Arrays.sort(m);
		while (true) {
			for (int i = 0; i < n; ++i) {
				if (m[i] != 0) {
					for (int j = i; j < n - 1; ++j) {
						m[j + 1] = m[j + 1] % m[i];
					}
					Arrays.sort(m);
					break;
				}
			}
			if (m[n-2]==0) {
				System.out.println(m[n-1]);
				break;
			}
		}
	}
}