import java.io.*;
import java.util.*;
import java.lang.ArrayIndexOutOfBoundsException;
import java.math.BigInteger;

/**
 * @author yoshikyoto
 */
class Main{
	static HashSet<String> set;
	static int maxLength;
	static String ans;
	static char[][] c;
	static int h, w;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String[] in = br.readLine().split(" ");
			h = Integer.parseInt(in[0]);
			w = Integer.parseInt(in[1]);
			if(h+w == 0) break;
			
			c = new char[h][w];
			for(int i = 0; i < h; i++)
				c[i] = br.readLine().toCharArray();
			
			set = new HashSet<String>();
			maxLength = 0;
			ans = "0";
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					// i, j から始まる文字列を調べる
					check(i, j);
				}
			}
			
			if(maxLength >= 2){
				System.out.println(ans);
			}else{
				System.out.println("0");
			}
		}
	}
	
	static int[] di = {-1, -1, -1, 0, 0, 1, 1, 1};
	static int[] dj = {-1, 0, 1, -1, 1, -1, 0, 1};
	static void check(int i, int j){
		for(int k = 0; k < 8; k++){
			// 方向が決定
			boolean[][] visited = new boolean[h][w];
			int ii = i, jj = j;
			StringBuilder sb = new StringBuilder("");
			while(!visited[ii][jj]){
				sb.append(c[ii][jj]);
				String str = sb.toString();
				
				if(set.contains(str)){
					// すでに出現したことがある場合
					int str_len = str.length();
					if(maxLength < str_len){
						// 長さの記録更新
						ans = str;
						maxLength = str_len;
					}else if(maxLength == str_len && str.compareTo(ans) < 0){
						// 長さは同じだけど辞書順で早い場合
						ans = str;
						maxLength = str_len;
					}
				}else{
					set.add(str);
				}
				visited[ii][jj] = true;
				ii = (ii + di[k] + h) % h;
				jj = (jj + dj[k] + w) % w;
			}
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