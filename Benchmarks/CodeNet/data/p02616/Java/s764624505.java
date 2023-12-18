import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		Long[] list = new Long[n];
		boolean allminus = true;
		for(int i = 0; i < n; i++){
		    long a = sc.nextLong();
		    list[i] = a;
		    if(a > 0) allminus = false;
		}
		
		Arrays.sort(list, (s, t) -> {
		    if(abs(s) == abs(t)){
		        return Long.compare(s, t);
		    }
		    return Long.compare(abs(t), abs(s));
		});
		//System.out.println(Arrays.toString(list));
		
		// 計算
		long result = 1;
		int MOD = 1000000007;
		int signum = 1;
		for(int i = 0; i < k; i++){
		    signum *= Long.signum(list[i]);
		}
		if(signum >= 0){
		    for(int i = 0; i < k; i++){
		        result *= list[i];
		        result = (result%MOD + MOD)%MOD;
		    }
		}else if(allminus){
		    for(int i = n-1; i > n-1-k; i--){
		        result *= list[i];
		        result = (result%MOD + MOD)%MOD;
		    }
		}else{
		    int indexM = -1;
		    for(int i = k-1; i >= 0; i--){
		        if(list[i] < 0){
		            indexM = i;
		            break;
		        }
		    }
		    int indexP = -1;
		    for(int i = k-1; i >= 0; i--){
		        if(list[i] >= 0){
		            indexP = i;
		            break;
		        }
		    }
		    long tmpA = 0;
		    int indexA = 0;
		    for(int i = k; i < n; i++){
		        if(indexM < 0) break;
		        if(list[i] < 0){
		            tmpA = list[indexM]*list[i];
		            indexA = i;
		            break;
		        }
		    }
		    long tmpB = 0;
		    int indexB = 0;
		    for(int i = k; i < n; i++){
		        if(indexP < 0) break;
		        if(list[i] >= 0){
		            tmpB = list[indexP]*list[i];
		            indexB = i;
		            break;
		        }
		    }
		    if(tmpA >= tmpB && indexP >= 0){
		        for(int i = 0; i < k; i++){
		            if(i == indexP) continue; 
		            result *= list[i];
		            result = (result%MOD + MOD)%MOD;
		        }
		        result *= list[indexA];
		        result = (result%MOD + MOD)%MOD;
		    }else if(indexM >= 0){
		        for(int i = 0; i < k; i++){
		            if(i == indexM) continue; 
		            result *= list[i];
		            result = (result%MOD + MOD)%MOD;
		        }
		        result *= list[indexB];
		        result = (result%MOD + MOD)%MOD;
		    }else{
		        for(int i = 0; i < k; i++){
		            result *= list[i];
		            result = (result%MOD + MOD)%MOD;
		        }
		    }
		}
		
		// 出力
		System.out.println(result);
	}
	
	public static class Scanner {
		private BufferedReader br; private StringTokenizer tok;
		public Scanner(InputStream is) throws IOException { br = new BufferedReader(new InputStreamReader(is));}
		private void getLine() throws IOException { while(!hasNext()) tok = new StringTokenizer(br.readLine());}
		private boolean hasNext() { return tok != null && tok.hasMoreTokens();}
		public String next() throws IOException { getLine(); return tok.nextToken();}
		public int nextInt() throws IOException { return Integer.parseInt(next());}
		public long nextLong() throws IOException { return Long.parseLong(next());}
		public double nextDouble() throws IOException { return Double.parseDouble(next());}
	}
}

