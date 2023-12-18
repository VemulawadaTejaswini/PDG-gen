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
			int n = readIntMap(0);
			int t = readIntMap(1);
			int l = readIntMap(2);
			int b = readIntMap(3);
			if(n+t+l+b == 0) break;
			
			int[] table = new int[n+1];
			// 休み
			for(int i = 0; i < l; i++){
				table[readInt()] = 1;
			}
			// 戻る
			for(int i = 0; i < b; i++){
				table[readInt()] = 2;
			}
			
			double[][] dp = new double[t+1][n+1];
			dp[0][0] = 1.0;
			
			for(int turn = 0; turn < t; turn++){
				for(int i = 0; i < n; i++){
					for(int dice = 1; dice <= 6; dice++){
						int masu = i + dice;
						if(masu > n){
							masu = n - (masu - n);
						}
						if(table[masu] == 1){
							// 一回休みの場合
							if(turn + 2 <= t){
								dp[turn+2][masu] += dp[turn][i] * 1.0 / 6.0;
							}
						}else if(table[masu] == 2){
							// スタートに戻る場合
							dp[turn+1][0] += dp[turn][i] * 1.0 / 6.0;
						}else{
							dp[turn+1][masu] += dp[turn][i] * 1.0 / 6.0;
						}
					}
				}
			}
			
			double ans = 0;
			for(int i = 0; i <= t; i++){
				ans += dp[i][n];
			}
			System.out.println(ans);
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