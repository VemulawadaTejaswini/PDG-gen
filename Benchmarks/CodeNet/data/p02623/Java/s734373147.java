import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (final Scanner sc = new Scanner(System.in);) {

			final int n = sc.nextInt();
			final int m = sc.nextInt();
			int k = sc.nextInt();

			final Long[] n_b = new Long[n+1];
			long n_rui=0;
			for (int i = 0; i < n; i++) {
				if(i==0) {
					n_b[i]=0L;
				}
				n_b[i] = sc.nextLong() + n_rui;
				n_rui = n_b[i];
			}

			final Long[] m_b = new Long[m+1];
			long m_rui = 0;
			for (int i = 0; i < m; i++) {
				if(i==0) {
					m_b[i]=0L;
				}
				m_b[i] = sc.nextLong() + m_rui;
				m_rui = m_b[i];
			}

			int c=0;
			nloop:for(int i = 0; i<n_b.length; i++) {
				for(int j = 0; j<m_b.length; j++) {
					long total = n_b[i] + m_b[j];
					int t = i+j;
					if(k<total) {
						continue nloop;
					}

					if(k > total && t> c) {
						c = t;
					}

				}
			}

		}
	}
}