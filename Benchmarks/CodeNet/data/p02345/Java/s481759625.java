
import java.io.*;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
 
public class Main{
	public void solve(){
		int N = nextInt();
		int Q = nextInt();
		SegmentTree tree = new SegmentTree(N);
		for(int i = 0; i < Q; i++){
			int t = nextInt();
			if(t == 0){
				tree.update(nextInt(), nextInt());
				
			}else{
				out.println(tree.values[tree.query(nextInt(), nextInt() + 1)]);
			}
		}
	}
	
	class SegmentTree{
		int n;
		int[] values;
		int[] idx;
		public SegmentTree(int nn){
			n = 1;
			while(n < nn){
				n *= 2;
			}
			values = new int[n * 2 - 1];
			idx = new int[n * 2 - 1];
			Arrays.fill(values, Integer.MAX_VALUE);
			
			for(int i = 0; i < n; i++){
				idx[i] = 0;
			}
			for(int i = 1; i < n; i++){
				idx[i + n - 1] = i;
			}
			int i = 0;
			int m = 1;
			int w = n;
			while(i < n){
				for(int j = 0; j < m; j++){
					idx[i++] = j * w;
				}
				m *= 2;
				w /= 2;
			}
			System.out.println();
		}
		
		public void update(int k, int a){
			values[k] = a;
			k += n - 1;
			while(k > 0){
				k = (k - 1) / 2;
				int i1 = idx[k * 2 + 1];
				int i2 = idx[k * 2 + 2];
				
				if(values[i1] > values[i2]){
					idx[k] = i2;
				}else{
					idx[k] = i1;
				}
			}
		}
		

		public int query(int begin, int end){
			return query(begin, end, 0, 0, n);
		}
		
		public int query(int a, int b, int k, int l, int r){
			if(r <= a || b <= l) return -1;
			
			if(a <= l && r <= b) return idx[k];
			else{
				int i1 = query(a, b, k * 2 + 1, l, (l + r) / 2);
				int i2 = query(a, b, k * 2 + 2, (l + r) / 2, r);
				if(i1 == -1) return i2;
				else if(i2 == -1) return i1;
				else if(values[i1] > values[i2]) return i2;
				else return i1;
			}
		}
	}


	
	private static PrintWriter out;
	public static void main(String[] args){
		out = new PrintWriter(System.out);
		new Main().solve();
		out.flush();
	}
	
	
	
	public static int nextInt(){
		int num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(;i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10 + (c - '0');
		}
		return minus ? -num : num;
	}

	
	public static long nextLong(){
		long num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(;i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10l + (c - '0');
		}
		return minus ? -num : num;
	}
	public static String next(){
		int c;
		while(!isAlNum(c = read())){}
		StringBuilder build = new StringBuilder();
		build.append((char)c);
		while(isAlNum(c = read())){
			build.append((char)c);
		}
		return build.toString();
	}
	
	
	private static byte[] inputBuffer = new byte[1024];
	private static int bufferLength = 0;
	private static int bufferIndex = 0;
	private static int read(){
		if(bufferLength < 0) throw new RuntimeException();
		if(bufferIndex >= bufferLength){
			try{
				bufferLength = System.in.read(inputBuffer);
				bufferIndex = 0;
			}catch(IOException e){
				throw new RuntimeException(e);
			}
			if(bufferLength <= 0) return (bufferLength = -1);
		}
		return inputBuffer[bufferIndex++];
	}
	
	private static boolean isAlNum(int c){
		return '!' <= c && c <= '~';
	}
}