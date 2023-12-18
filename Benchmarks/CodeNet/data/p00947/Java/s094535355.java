import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
 
public class Main {
	
	public static int check_digit(int[][] table, int[] code){
		return check_digit(table, code, code.length);
	}
	
	public static int check_digit(int[][] table, int[] code, int len){
		int ret = 0;
		for(int i = 0; i < len; i++){
			ret = table[ret][code[i]];
		}
		
		return ret;
	}
	
	public static void set_digit(int[][] table, int[] code, int ... params){
		System.arraycopy(params, 0, code, 0, params.length);
		code[params.length] = check_digit(table, code, params.length);
	}
	
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int SIZE = 10;
		int[][] table = new int[SIZE][SIZE];
		for(int i = 0; i < SIZE; i++){
			for(int j = 0; j < SIZE; j++){
				table[i][j] = sc.nextInt();
			}
		}
		
		int[] code = new int[5];
		int count = 0;
		for(int fst = 0; fst <= 9; fst++){
			for(int snd = 0; snd <= 9; snd++){
				for(int thd = 0; thd <= 9; thd++){
					LOOP:
					for(int fou = 0; fou <= 9; fou++){
						
						for(int pos = 0; pos < code.length; pos++){
							for(int value = 0; value <= 9; value++){
								set_digit(table, code, fst, snd, thd, fou);
								
								if(code[pos] == value){ continue; }
								code[pos] = value;
								
								if(check_digit(table, code) == 0){
									//System.out.println("NG");
									count++;
									continue LOOP;
								}
							}
						}
						
						for(int i = 0; i < code.length - 1; i++){
							set_digit(table, code, fst, snd, thd, fou);
							
							if(code[i] == code[i + 1]){
								continue;
							}
							
							final int tmp = code[i];
							code[i] = code[i + 1];
							code[i + 1] = tmp;
							
							if(check_digit(table, code) == 0){
								//System.out.println(count + " : " + fst + " " + snd + " " + thd + " " + fou + " " + check_digit(table, new int[]{fst, snd, thd, fou}));
								//System.out.println(Arrays.toString(code) + " " + check_digit(table, code));
								count++;
								continue LOOP;
							}
						}
						
					}
				}
			}
		}
		
		System.out.println(count);
	}
 
	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;
 
		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}	
 
		private void getLine() throws IOException {
			while (!hasNext()) {
				tok = new StringTokenizer(br.readLine());
			}
		}
 
		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}
 
		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
 
		public void close() throws IOException {
			br.close();
		}
	}
}