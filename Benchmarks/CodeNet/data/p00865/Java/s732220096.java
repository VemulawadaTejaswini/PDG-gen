import java.io.*;
import java.util.*;
import java.lang.ArrayIndexOutOfBoundsException;
import java.math.BigInteger;

/**
 * @author yoshikyoto
 */
class Main extends MyUtil{
	// public static Graph g;
	public static void main(String[] args) throws Exception{
		while(true){
			// ここはただたんに n, m, k　を標準入力から受け取っているだけ
			int n = readIntMap(0);	// ダイスの数
			int m = readIntMap(1);	// ダイスの面の数
			int k = readIntMap(2);	// カット
			if(n == 0 && m == 0 && k == 0) break;

			// dp[][sum] = 合計sumとなるようなサイコロの出方
			// sumの最大値は m*n
			int[][] dp = new int[2][m*n+1];
			dp[0][0] = 1;
			
			// i回目のサイコロ
			for(int i = 0; i < n; i++){
				// i+1番目のテーブルを初期化
				for(int j = 0; j < m*n+1; j++) dp[(i+1)%2][j] = 0;
				
				// i回振って合計jで、i+1回目にhが出たとき
				for(int prev_sum = 0; prev_sum < n*m+1; prev_sum++){
					if(dp[i%2][prev_sum] == 0) continue;
					for(int me = 1; me <= m; me++){
						dp[(i+1)%2][prev_sum + me] += dp[i%2][prev_sum];
					}
				}
			}
			
			// System.out.println(Arrays.deepToString(dp));
			
			int sum = 0;
			for(int i = 0; i < n*m+1; i++){
				sum += Math.max(1, i - k) * dp[n%2][i];
			}
			System.out.println(sum / Math.pow(m, n));
		}
	}
}

// --- ここから下はライブラリ ----------
/**
 * MyUtil
 * @author yoshikyoto
 */
class MyUtil {
	public static int[] cp(int[] a){
		int[] b = new int[a.length];
		for(int i = 0; i < a.length; i++) b[i] = a[i];
		return b;
	}
	public static int toInt(boolean[] a){
		int pow = 1, ret = 0, l = a.length;
		for(int i = 0; i < l; i++){
			if(a[i]) ret += pow;
			pow *= 2;
		}
		return ret;
	}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int ins[];
	public static int[] readIntMap() throws IOException{return parseInt(readLine().split(" "));}
	public static int readIntMap(int i) throws Exception{
		if(i == 0) ins = readIntMap();
		return ins[i];
	}
	public static int[][] readIntMap(int n, int m) throws IOException{
		int[][] ret = new int[n][];
		for(int i = 0; i < n; i++) ret[i] = readIntMap();
		return ret;
	}
	public static int[] readIntToMap(int n) throws IOException{
		int[] ret = new int[n];
		for(int i = 0; i < n; i++) ret[i] = readInt();
		return ret;
	}
	public static int[] readNoDistIntMap() throws IOException{
		String[] strs = readLine().split("");
		int l = strs.length;
		int[] ret = new int[l-1];
		for(int i = 1; i < l; i++)
			ret[i-1] = parseInt(strs[i]);
		return ret;
	}
	public static String readLine() throws IOException{return br.readLine();}
	public static int readInt() throws IOException{return Integer.parseInt(br.readLine());}
	public static int[] parseInt(String[] arr){
		int[] res = new int[arr.length];
		for(int i = 0; i < arr.length; i++)res[i] = Integer.parseInt(arr[i]);
		return res;
	}
	public static double[] parseDouble(String[] arr){
		double[] res = new double[arr.length];
		for(int i = 0; i < arr.length; i++)res[i] = Double.parseDouble(arr[i]);
		return res;
	}
	public static boolean[] parseBool(String[] arr){
		int[] t = parseInt(arr);
		boolean[] res = new boolean[t.length];
		for(int i = 0; i < t.length; i++){
			if(t[i] == 1){res[i] = true;
			}else{res[i] = false;}
		}
		return res;
	}
	public static int parseInt(Object o){
		return Integer.parseInt(o.toString());
	}
}