import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner cs = new Scanner(System.in);
		int N = cs.nextInt();
		int[] a = new int [N];
		int[] b = new int [N];
		int[] c = new int [N];
		int[] ans = new int [N];
		int e = 0, f = 0, g = 0, k = 0, l = 0, m = 0;
		int[] x = new int [N];
		int[] y = new int [N];
		int[] z = new int [N];
		for(int i = 0; i < N*3; i++){
			switch(i % 3){
			case 0:
				a[e] = cs.nextInt();
				e = e + 1;
				break;
			case 1:
				b[f] = cs.nextInt();
				f = f + 1;
				break;
			case 2:
				c[g] = cs.nextInt();
				g = g + 1;
				break;
			}
		}
		for(int i = 0; i < N - 1; i++){
			for(int j = i + 1; j < N; j++){
				if(a[i] == a[j]){
					x[k] = a[i];
					k = k + 1;
				}
			}
		}
			for(int i = 0; i < k; i++){
				for(int j = 0; j < N; j++){
					if(x[i] == a[j]){
						a[j] = 0;
					}
				}
			}


		for(int o = 0; o < N - 1; o++){
			for(int p = o + 1; p < N; p++){
				if(b[o] == b[p]){
					y[l] = b[o];
					l = l + 1;
				}
			}
		}

			for(int o = 0; o < l; o++){
				for(int p = 0; p < N; p++){
					if(y[o] == b[p]){
						b[p] = 0;
					}
				}
			}


		for(int q = 0; q < N - 1; q++){
			for(int r = q + 1; r < N; r++){
				if(c[q] == c[r]){
					z[m] = c[q];
					m = m + 1;
				}
			}
		}

			for(int q = 0; q < m; q++){
				for(int r = 0; r < N; r++){
					if(z[q] == c[r]){
						c[r] = 0;
					}
				}
			}

		for(int i = 0; i < N; i++){
			ans[i] = a[i] + b[i] + c[i];
			System.out.println(ans[i]);
		}
	}

}