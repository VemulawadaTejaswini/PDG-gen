import java.io.*;
import java.util.*;
import java.lang.ArrayIndexOutOfBoundsException;
import java.math.BigInteger;

/**
 * @author yoshikyoto
 */
class Main extends MyUtil{
	public static void main(String[] args) throws Exception{
		int n = readInt();
		for (int i = 0; i < n; i++) {
			int[] in = readIntMap();
			if(isPrime(in[0], in[1])){
				System.out.println("P");
			}else{
				System.out.println("C");
			}
		}
	}
	
	static boolean isPrime(int p, int q){
		int cnt = 0;
		int max_sq = sq(p) + sq(q);
		for(int m = 0; m*m <= max_sq; m++){
			for(int n = 0; m*m + n*n <= max_sq; n++){
				if(sq(m) + sq(n) == 0) continue;
				
				if(canDivide(p, q, m, n)){
					// System.out.println(m + " " + n);
					cnt++;
				}
				if(m != 0 && canDivide(p, q, -m, n)){
					// System.out.println(m + " " + n);
					cnt++;
				}
				if(n != 0 && canDivide(p, q, m, -n)){
					// System.out.println(m + " " + n);
					cnt++;
				}
				if(m != 0 && n != 0 && canDivide(p, q, -m, -n)){
					// System.out.println(m + " " + n);
					cnt++;
				}
			}
		}
		if(cnt == 8) return true;
		return false;
	}
	
	static boolean canDivide(int p, int q, int m, int n){
		return (m*p + n*q) % (sq(m) + sq(n)) == 0 && (m*q - n*p) % (sq(m) + sq(n)) == 0;
	}
	
	public static int sq(int i) {
		return i * i;
	}
}

// --- ここから下はライブラリ ----------
/**
 * MyUtil
 * @author yoshikyoto
 */
class MyUtil {
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