import java.util.*;
import java.io.*;
public class Main {
			
    public void solve() throws IOException{
    	int n;
    	while( (n = nextInt()) != 0 ){
    		List<Integer> time = new ArrayList<Integer>();
    		for(int i = 0; i < n; i++){
    			time.add(nextInt());
    		}
    		Collections.sort(time);
    		long ans = 0;
    		long sum = 0;
    		for(int i = 0; i < time.size()-1; i++){
    			ans += time.get(i)+sum;
    			sum += time.get(i);
    		}
    		System.out.println(ans);
    	}
    }
    public static void main (String args[]) throws IOException{
        new Main().run();
    }

    BufferedReader reader;
    StringTokenizer tokenizer;
    PrintWriter writer; 
    public void run() throws IOException{
        try{
            reader = new BufferedReader(new InputStreamReader(System.in));
            tokenizer = null;
            writer = new PrintWriter(System.out);
            solve();
            reader.close();
            writer.close();
        } catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
    public int nextInt() throws IOException{
        return Integer.parseInt(nextToken());
    }
    public String nextToken() throws IOException{
        while( tokenizer == null || !tokenizer.hasMoreTokens() ){
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }
} 