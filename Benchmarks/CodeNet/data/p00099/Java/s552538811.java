import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static class SegTree{
		int n;
		int[] dat;
		int[] top;

		public SegTree(int n_) {
			int n = 1;
			while(n < n_){
				n *= 2;
			}
			
			this.n = n;
			dat = new int[this.n * 2 - 1];
			top = new int[this.n * 2 - 1];
			for(int i = 0; i < this.n * 2 - 1 ; i++){
				dat[i] = 0;
				top[i] = 0;
			}
		}
		
		public void update_add(int k, int a){
			k += n - 1;
			dat[k] += a;
			top[k] = k - n + 1;
			
			while(k > 0){
				k = (k - 1) / 2;
				
				if(dat[k * 2 + 1] >= dat[k * 2 + 2]){
					dat[k] = dat[k * 2 + 1];
					top[k] = top[k * 2 + 1];
				}else{
					dat[k] = dat[k * 2 + 2];
					top[k] = top[k * 2 + 2];  
				}
			}
		}
		
		public int getMax(){
			return dat[0];
		}
		
		public int getTop(){
			return top[0];
		}
		
		public int size(){
			return n;
		}
		
		public String toString(){
			return Arrays.toString(dat).replaceAll("" + Long.MIN_VALUE, "-oo");
		}
		
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		final int q = sc.nextInt();
		
		SegTree seg = new SegTree(n);
		
		for(int i = 0; i < q; i++){
			final int a = sc.nextInt() - 1;
			final int v = sc.nextInt();
			
			seg.update_add(a, v);
			System.out.println((seg.getTop() + 1) + " " + seg.getMax());
		}
	}
	
	public static class Scanner {
		
		private BufferedReader br;
		private StringTokenizer tok;
		
		public Scanner(InputStream is) throws IOException{
			br = new BufferedReader(new InputStreamReader(is));
			getLine();
		}
		
		private void getLine() throws IOException{
			tok = new StringTokenizer(br.readLine());
		}
		
		private boolean hasNext(){
			return tok.hasMoreTokens();
		}
		
		public int nextInt() throws IOException{
			if(hasNext()){
				return Integer.parseInt(tok.nextToken());
			}else{
				getLine();
				return Integer.parseInt(tok.nextToken());
			}
		}
		
		public long nextLong() throws IOException{
			if(hasNext()){
				return Long.parseLong(tok.nextToken());
			}else{
				getLine();
				return Long.parseLong(tok.nextToken());
			}
		}
		
		public double nextDouble() throws IOException{
			if(hasNext()){
				return Double.parseDouble(tok.nextToken());
			}else{
				getLine();
				return Double.parseDouble(tok.nextToken());
			}
		}
	}
}