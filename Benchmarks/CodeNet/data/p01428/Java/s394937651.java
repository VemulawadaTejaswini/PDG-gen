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
class Main extends MyUtil{
	// public static Graph g;
	public static void main(String[] args) throws Exception{
		// ボードの入力を受ける
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] table = new char[8][8];
		for(int i = 0; i < 8; i++){
			table[i] = br.readLine().toCharArray();
		}
		
		Board b = new Board(table);
		char[] marks = {'o', 'x'};
		int turn = 0;
		boolean prev_finish_flag = false;
		while(true){
			char m = marks[turn];
			boolean curr_finish_flag = false;
			if(b.turn(m) == 0) curr_finish_flag = true;
			if(prev_finish_flag && curr_finish_flag) break;
			
			turn = (turn + 1) % 2;
			prev_finish_flag = curr_finish_flag;
			// b.print();
			// System.out.println();
		}
		b.print();
	}
}

class Board{
	char[][] table;
	Board(char[][] table){
		this.table = table;
	}
	
	void print(){
		for(int i = 0; i < 8; i++){
			StringBuffer buf = new StringBuffer();
			for(int j = 0; j < 8; j++){
				buf.append(table[i][j]);
			}
			System.out.println(buf.toString());
		}
	}
	
	int turn(char m){
		int max_i = -1, max_j = -1;
		int max_cnt = 0;
		
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				if(table[i][j] != '.') continue;
				int cnt = check(m, i, j, false);
				if(cnt > max_cnt && m == 'o' ||
						cnt >= max_cnt && m == 'x'){
					max_cnt = cnt;
					max_i = i;
					max_j = j;
				}
			}
		}

		// System.out.println("" + m + " " + max_cnt + " " + max_i + " " + max_j);
		if(max_cnt > 0){
			check(m, max_i, max_j, true);
		}
		return max_cnt;
	}
	
	static int[] di = {-1,-1,-1,0,0,1,1,1};
	static int[] dj = {-1,0,1,-1,1,-1,0,1};
	int check(char m, int i, int j, boolean replace_flag){
		int sum = 0;
		for(int k = 0; k < 8; k++){
			int cnt;
			for(cnt = 1; cnt <= 8; cnt++){
				try{
					char table_mark = table[i + cnt*di[k]][j + cnt*dj[k]];
					if(table_mark == m){
						// 必要ならここで置き換える
						if(replace_flag){
							table[i][j] = m;
							for(int mult = cnt-1; mult > 0; mult--){
								try{
									table[i + mult*di[k]][j + mult*dj[k]] = m;
								}catch(Exception e){
									continue;
								}
							}
						}
						break;
					}else if(table_mark == '.'){
						cnt = 1;
						break;
					}
				}catch(Exception e){
					// マスを飛び出した場合
					// System.err.println(e);
					cnt = 1;
					break;
				}
			}
			sum += (cnt - 1);
		}
		return sum;
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