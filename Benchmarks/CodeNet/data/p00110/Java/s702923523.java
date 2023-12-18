import java.util.*;
import java.io.*;
public class Main {
	public String simulate(char[] x, char[] y, char[] a){
		if( a.length < Math.max(x.length, y.length) ){
			return "NA";
		} 
outer:	for(int i = 0; i <= 9; i++){
			if( i == 0 ){
				if( (x.length > 1 && x[0] == 'X') || (y.length > 1 && y[0] == 'X') || (a.length > 1 && a[0] == 'X') ){
					continue;
				}
			}
			int add = 0;
			for(int j = 1; j <= a.length; j++){
				int p = (x.length-j < 0) ? 0 : (x[x.length-j] == 'X') ? i : x[x.length-j]-'0';
				int q = (y.length-j < 0) ? 0 : (y[y.length-j] == 'X') ? i : y[y.length-j]-'0';
				int r = (a[a.length-j] == 'X') ? i : a[a.length-j]-'0';
				System.out.println(p + " " + q + " " + r);
				int sum = p+q+add;
				if( sum%10 == r ){
					add = sum/10;
					continue;
				} else {
					continue outer;
				}
			}
			return Integer.toString(i);
		}
		return "NA";
	}
			
    public void solve() throws IOException{
    	Scanner stdIn = null;
    	try{
    		stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        	while( stdIn.hasNext() ){
            	String str = stdIn.next();
            	String[] s = str.split("=");
           	   	String[] t = s[0].split("\\+");
               	char[] x = t[0].toCharArray();
            	char[] y = t[1].toCharArray();
            	char[] a = s[1].toCharArray();
            	System.out.println(simulate(x, y, a));
       		}
       	} finally {
       		if( stdIn != null ){
       			stdIn.close();
       		}
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