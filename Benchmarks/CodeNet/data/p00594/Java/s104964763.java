import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		//int[] array = new int[1000001];
		
		while (true) {
			final int N = sc.nextInt();

			if (N == 0) {
				break;
			}
			System.gc();
			TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
            
			
            for(int i = 0; i < N; i++){
                final int A = sc.nextInt();
                 
                int value = 0;
                if(map.containsKey(A)){
                    value = map.get(A);
                }
                value++;
                 
                map.put(A, value);
            }
             
            boolean flag = false;
            for(Entry<Integer, Integer> entry : map.entrySet()){
                //System.out.println(entry.getValue());
                 
                if(entry.getValue() > N / 2){                   
                    System.out.println(entry.getKey());
                    flag = true;
                    break;
                }
            }
             
            if(!flag){
                System.out.println("NO COLOR");
            }
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
			while(tok == null || !tok.hasMoreTokens()){
				tok = new StringTokenizer(br.readLine());
			}
		}
		
		private boolean hasNext(){
			return tok.hasMoreTokens();
		}
		
		public String next() throws IOException{
			if(hasNext()){
				return tok.nextToken();
			}else{
				getLine();
				return tok.nextToken();
			}
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