import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && m == 0)
				break;
			int[] h = new int[n];
			int[] w = new int[m];
//			int[] y = new int[1500001];
			List<Integer> x = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				h[i] = sc.nextInt();
				int nh = 0;
				for (int j = i; j >= 0; j--) {
					nh += h[j];
//					y[nh]++;
					x.add(nh);
				}
			}
			int result = 0;
			Collections.sort(x);
			for (int i = 0; i < m; i++) {
				w[i] = sc.nextInt();
				int nw = 0;
				for (int j = i; j >= 0; j--) {
					nw += w[j];
//					result += y[nw];
					for(int k=0;k<x.size();k++){
						if(nw==x.get(k))
							result++;
						else if(nw < x.get(k))
							break;
					}
				}
			}
			System.out.println(result);
		}
		sc.close();
	}
}