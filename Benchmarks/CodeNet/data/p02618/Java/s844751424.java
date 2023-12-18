import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
 

public class Main {	
	
	static int D;
	static int[] C;
	static int[][] S;
	static long[] all_pena;
	public static void main(String[] args) throws Exception {
		
		//int N = scan.nextInt();
		//long L = scan.nextLong();
		//double D = scan.nextDouble();
		//char[] A = scan.next().toCharArray();
		D = scan.nextInt();
		C = new int[26];
		S = new int[D][26];
		all_pena = new long[26];
		for(int i=0; i<26; i++){
			C[i] = scan.nextInt();
		}
		for(int j=0; j<D; j++){
			for(int i=0; i<26; i++){
				S[j][i] = scan.nextInt();
			}
		}

		int[] schedule = new int[D];
		Random random = new Random();
		for(int i=0; i<D; i++){
			schedule[i] = random.nextInt(26);
		}

		/*
		int[] schedule = new int[D];
		for(int i=0; i<D; i++)schedule[i] = scan.nextInt()-1;



		long ans = 0;
		for(int d=0; d<D; d++){
			ans += S[d][schedule[d]];
		}
		for(int i=0; i<26; i++){
			ans -= pena_by_contest(schedule, i);
		}

		int M = scan.nextInt();

		for(int i=0; i<M; i++){
			int d = scan.nextInt()-1;
			int q = scan.nextInt()-1;
			ans += query_diff(schedule, d, q);
			out.println(ans);
		}

		*/

		long score = 0;
		for(int d=0; d<D; d++){
			score += S[d][schedule[d]];
		}
		for(int i=0; i<26; i++){
			score -= pena_by_contest(schedule, i);
		}
		int cnt =0;
		while(cnt < 1000){
			long old_score = score;
			int d = random.nextInt(D);
			int q = random.nextInt(D);
			int old_contest = schedule[d];
			long diff = query_diff(schedule, d, q);
			if(diff<0){
				schedule[d] = old_contest;
				pena_by_contest(schedule, old_contest);
				pena_by_contest(schedule, q);
				score = old_score;
			}else{
				score += diff;
			}
			cnt++;
			//out.println(score);
		}

		for(int s : schedule){
			out.println(s);
		}
		
		out.flush();
	}

	//クエリを実施したことによるスコアの変化を計算する
	static long query_diff(int[] schedule, int d, int q){
		long diff = 0;
		diff -= S[d][schedule[d]];
		diff += S[d][q];
		int old_contest = schedule[d];
		long old_pena = all_pena[old_contest] + all_pena[q];
		diff += old_pena;
		
		schedule[d] = q;
		pena_by_contest(schedule, old_contest);
		pena_by_contest(schedule, q);
		long new_pena = all_pena[old_contest] + all_pena[q];
		diff -= new_pena;
		return diff;
	}

	static long total_score(int[] schedule){

		long ans = 0;
		for(int d=0; d<D; d++){
			ans += score(schedule, d);
		}
		return ans;

	}

	static long score(int[] schedule, int d){
		long rtn = 0;
		rtn += S[d][schedule[d]];
		for(int i=0; i<26; i++){
			rtn -= pena(schedule, d, i);
		}
		
		return  rtn;
	}

	static long pena_by_contest(int[] schedule, int context_no){
		long tmp = 0;
		for(int d=0; d<D; d++){
			tmp += pena(schedule, d, context_no);
		}
		return all_pena[context_no] = tmp;
	}

	static long pena(int[] schedule, int d, int context_no){
		return C[context_no] * last(schedule, d, context_no);
	}

	static long last(int[] schedule, int d, int j){
		int rtn = 0;
		boolean exec = false;
		for(int i=0; i<=d; i++){
			if(j == schedule[d-i]){
				exec = true;
				rtn = i;
				//out.println("fff");
				break;
			}
		}
		return (!exec)? d+1 : rtn;
	}
	
	static FastScanner scan = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);			 
	static long MOD = 1_000_000_007;

	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static int[] dx8 = {1,-1,0,0,1,1,-1,-1};
	static int[] dy8 = {0,0,1,-1,1,-1,1,-1};

	//GCD最大公約数を返す
	static long gcd(long a, long b){
		if(b == 0) return a;
		return gcd(b, a%b);
	}

	//aとbの最小公倍数を返す
	static long lcm (long a, long b) {
		return ((a/gcd(a,b))*b);
	}
	
	//入力
	//https://qiita.com/p_shiki37/items/a0f6aac33bf60f5f65e4
	static class FastScanner {
	    private final InputStream in = System.in;
	    private final byte[] buffer = new byte[1024];
	    private int ptr = 0;
	    private int buflen = 0;
	    private boolean hasNextByte() {
	        if (ptr < buflen) {
	            return true;
	        }else{
	            ptr = 0;
	            try {
	                buflen = in.read(buffer);
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	            if (buflen <= 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
	    public String next() {
	        if (!hasNext()) throw new NoSuchElementException();
	        StringBuilder sb = new StringBuilder();
	        int b = readByte();
	        while(isPrintableChar(b)) {
	            sb.appendCodePoint(b);
	            b = readByte();
	        }
	        return sb.toString();
	    }
	    public long nextLong() {
	        if (!hasNext()) throw new NoSuchElementException();
	        long n = 0;
	        boolean minus = false;
	        int b = readByte();
	        if (b == '-') {
	            minus = true;
	            b = readByte();
	        }
	        if (b < '0' || '9' < b) {
	            throw new NumberFormatException();
	        }
	        while(true){
	            if ('0' <= b && b <= '9') {
	                n *= 10;
	                n += b - '0';
	            }else if(b == -1 || !isPrintableChar(b)){
	                return minus ? -n : n;
	            }else{
	                throw new NumberFormatException();
	            }
	            b = readByte();
	        }
	    }
	    public int nextInt() {
	        long nl = nextLong();
	        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
	        return (int) nl;
	    }
	    public double nextDouble() { return Double.parseDouble(next());}
	}
}
