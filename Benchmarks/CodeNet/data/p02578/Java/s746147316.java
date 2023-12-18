import java.io.*;
import java.util.*;

public class Main {
	
	static long mod= (long) 1e9+7;
	
		
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Reader.init(System.in);
		PrintWriter out=new PrintWriter(System.out);
		int n=Reader.nextInt();
		int[] arr=new int[n];
		long ans=0;
		int max=0;
		for(int i=0;i<n;i++) {
			int a=Reader.nextInt();
			if(max>a) {
				ans+=(max-a);
			}
			max=Math.max(a,max);
		}
		out.println(ans);
		
		out.flush();
		
	}

}


class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;
    /** call this method to initialize reader for InputStream */
    static void init() throws IOException {
        reader = new BufferedReader(
                new FileReader("C:\\Users\\samee\\Desktop\\GRE prep\\confusion.txt"));
        tokenizer = new StringTokenizer("");
    }
    static void init(InputStream input) {
        reader = new BufferedReader(
                new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }
    /** get next word */
    static String nextLine() throws IOException{
        return reader.readLine();
    }
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                    reader.readLine() );
        }
        return tokenizer.nextToken();
    }
    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
    static long nextLong() throws IOException {
        return Long.parseLong( next() );
    }
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}