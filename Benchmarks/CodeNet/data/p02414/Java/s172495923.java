import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	private static int n, m, l;
	private static long[][] a, b;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = br.readLine().split(" ");
		n = Integer.parseInt(strArr[0]);
		m = Integer.parseInt(strArr[1]);
		l = Integer.parseInt(strArr[2]);
		
		a = new long[n][m];
		b = new long[m][l];
		
		for(int i = 0;i < n;i++){
			a[i] = toLongArray(br.readLine().split(" "));
		}
		
		for(int i = 0;i < m;i++){
			b[i] = toLongArray(br.readLine().split(" "));
		}
		
		
		for(int i = 0;i < n;i++){
			for(int j = 0;j < l;j++){
				System.out.print(get(i, j));
				if(j == l - 1){
					break;
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	private static long get(int r, int c){
		long sum = 0;
		for(int i = 0;i < m;i++){
			sum += a[r][i] * b[i][c];
		}
		return sum;
	}
	
	private static long[] toLongArray(String[] strArray){
		long[] arr = new long[strArray.length];
		for(int i = 0;i < arr.length;i++){
			arr[i] = Long.parseLong(strArray[i]);
		}
		return arr;
	}
}