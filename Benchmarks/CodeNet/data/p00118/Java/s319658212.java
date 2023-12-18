import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;
import java.util.Scanner;
import java.util.Queue;

/**
 * @author yoshikyoto
 */
class Main{
	static final boolean DEBUG = false;
	static Scanner sc = new Scanner(new InputStreamReader(System.in));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static char[][] field;
	static int h, w;
	public static void main(String args[]) throws Exception{
		while(true){
			int[] in = readIntMap();
			h = in[0]; w = in[1];
			if(h == 0 && w == 0) return;
			
			// 入力のパース
			field = new char[h][w];
			for(int i = 0; i < h; i++){
				String str = readLine();
				for(int j = 0; j < w; j++){
					field[i][j] = str.charAt(j);
				}
			}
			
			int count = 0;
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					char c = field[i][j];
					if(c == '.') continue;
					count++;
					field[i][j] = '.';
					dfs(i, j, c);
				}
			}
			p(count);
		}
	}
	
	public static void dfs(int i, int j, char c){
		if(i > 0 && field[i-1][j] == c){
			field[i-1][j] = '.';
			dfs(i-1, j, c);
		}

		if(i < h-1 && field[i+1][j] == c){
			field[i+1][j] = '.';
			dfs(i+1, j, c);
		}

		if(j > 0 && field[i][j-1] == c){
			field[i][j-1] = '.';
			dfs(i, j-1, c);
		}

		if(j < w-1 && field[i][j+1] == c){
			field[i][j+1] = '.';
			dfs(i, j+1, c);
		}
	}
		

	public static int[] readIntMap() throws IOException{return parseInt(readLine().split(" "));}
	public static String readLine() throws IOException{return br.readLine();}
	public static int readInt() throws IOException{return Integer.parseInt(br.readLine());}
	public static void pa(Object[] arr){System.out.println(Arrays.toString(arr));}
	public static void pa(int[] arr){System.out.println(Arrays.toString(arr));}
	public static void pa(double[] arr){System.out.println(Arrays.toString(arr));}
	public static void pa(boolean[] arr){System.out.println(Arrays.toString(arr));}
	public static void p(Object o){System.out.println(o.toString());}
	public static void d(Object o){if(DEBUG)System.out.println(o.toString());}
	public static void da(int[] arr){if(DEBUG)System.out.println(Arrays.toString(arr));}
	public static void sort(int[] a){Arrays.sort(a);}
	public static int[] parseInt(String[] arr){
		int[] res = new int[arr.length];
		for(int i = 0; i < arr.length; i++)res[i] = Integer.parseInt(arr[i]);
		return res;
	}
	public static boolean[] parseBool(String[] arr){
		int[] t = parseInt(arr);
		boolean[] res = new boolean[t.length];
		for(int i = 0; i < t.length; i++){
			if(t[i] == 1){
				res[i] = true;
			}else{
				res[i] = false;
			}
		}
		return res;
	}
	public static int parseInt(Object o){return Integer.parseInt(o.toString());}
	public static int digit(int n){return String.valueOf(n).length();}
	public static String reverse(String s){
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse().toString();
	}
	
}

/**
 * 整数を数え上げたりするクラス
 * Prime.calc(int n) でnまでエラトステネスの篩を実行。
 * @author yoshikyoto
 * @param a[i] iが素数の時true
 * @param count[i] i以下の素数の数
 */
class Prime{
	static boolean[] a;
	static int[] count;
	public static void calc(int n){
		a = new boolean[n+1];
		a[0] = false; a[1] = false;
		for(int i = 2; i <= n; i++) a[i] = true;
		// ふるい
		for(int i = 2; i < (n - 3) / 2; i++)
			if(a[i]) for(int j = 2; j * i <= n; j++)
					a[j * i] = false;
		
		// 数え上げ
		count = new int[n+1];
		count[0] = 0;
		for(int i = 1; i <= n; i++){
			int gain = 0;
			if(a[i]) gain = 1;
			count[i] = count[i-1] + gain;
		}
	}
}

class AI extends ArrayList<Integer>{}
class SI extends Stack<Integer>{}

class MyHashMap<E> extends HashMap<E, Integer>{
	ArrayList<E> keyArray = new ArrayList<E>();
	public void add(E key){add(key, 1);}
	public void add(E key, Integer value){
		if(containsKey(key)){
			value += get(key);
		}else{
			keyArray.add(key);
		}
		put(key, value);
	}
}