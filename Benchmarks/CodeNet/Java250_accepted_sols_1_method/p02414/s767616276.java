import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] st = sc.readLine().split(" ");
		int n = Integer.parseInt(st[0]);
		int m = Integer.parseInt(st[1]);
		int l = Integer.parseInt(st[2]);
		long[][] a = new long[n][m];
		long[][] b = new long[m][l];
		long t = 0;
		for(int i = 0;i < n;i++){
			st = sc.readLine().split(" ");
			for(int k = 0;k < m;k++){
				a[i][k] = Long.parseLong(st[k]);
			}
		}
		for(int i = 0;i < m;i++){
			st = sc.readLine().split(" ");
			for(int k = 0;k < l;k++){
				b[i][k] = Long.parseLong(st[k]);
			}
		}
		for(int i = 0;i < n;i++){
			for(int k = 0;k < l;k++){
				for(int j = 0;j < m;j++){
					t += a[i][j]*b[j][k];
				}
				sb.append(t);
				t = 0;
				if(k!=l-1)
					sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}