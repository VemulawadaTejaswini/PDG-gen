import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.ArrayIndexOutOfBoundsException;
import java.math.BigInteger;

import javax.script.AbstractScriptEngine;


/**
 * @author yoshikyoto
 */
class Main{
	// public static Graph g;
	static int[][] dp = new int[2][256];
	static int inf = 1<<28;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String[] in = br.readLine().split(" ");
			int n = Integer.parseInt(in[0]);
			int m = Integer.parseInt(in[1]);
			if(n == 0 && m == 0) break;

			int[] c = new int[m];
			int[] x = new int[n];
			for (int i = 0; i < m; i++) {
				c[i] = Integer.parseInt(br.readLine());
			}
			for (int i = 0; i < n; i++) {
				x[i] = Integer.parseInt(br.readLine());
			}
			
			// dpテーブルの初期化
			for(int j = 0; j < 256; j++){
				dp[0][j] = inf;
				dp[1][j] = inf;
			}
			dp[0][128] = 0;
			for(int i = 1; i <= n; i++){
				// System.out.println("for1 " + i);
				// DPテーブルの初期化
				for(int j = 0; j < 256; j++){
						dp[i%2][j] = inf;
				}
				
				// 探索
				for(int j = 0; j < 256; j++){
					int sum = dp[(i-1)%2][j];
					if(sum == inf) continue;
					for(int k = 0; k < m; k++){
						// 次の値
						int next_j = j + c[k];
						next_j = Math.max(0, Math.min(255, next_j));
						// System.out.println("next value " + next_j);
						// 二乗誤差を足す
						int next_sum = sum + sq(next_j - x[i-1]);
						// System.out.println("next sum " + next_sum);
						dp[i%2][next_j] = Math.min(dp[i%2][next_j], next_sum);
					}
				}
			}
			
			int ans = inf;
			for(int i = 0; i < 256; i++){
				ans = Math.min(ans, dp[n%2][i]);
			}
			System.out.println(ans);
		}
	}

	public static int sq(int i) {
		return i * i;
	}

	public static double sq(double d) {
		return d * d;
	}
}

class Arg{
	int time, val, sum;
	Arg(int t, int v, int s){
		time = t;
		val = v;
		sum = s;
	}
	public void print(){
		System.out.println(time + " " + val + " " + sum);
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