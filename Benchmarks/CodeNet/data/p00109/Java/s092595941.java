import java.util.*;
import java.io.*;

public class Main {
	
	public int calculate(String str){
		StringBuilder ans = new StringBuilder(str);
		while( true ){
			StringBuilder temp = new StringBuilder();
			int key = 0;
			int before = -1;
			int after = ans.length();
			for(int i = 0; i < ans.length(); i++){
				if( !Character.isDigit(ans.charAt(i)) ){
					if( ans.charAt(i) == '*' || ans.charAt(i) == '/' ){
						key = i;
						break;
					} else if( key == 0 ){
						key = i;
					}
				}
			}
		//	System.out.println("before = " + before + ", key = " + key + ", after = " + after);
			if( key == 0 ){
				break;
			}
			for(int i = key-1; i > 0; i--){
				if( !Character.isDigit(ans.charAt(i)) ){
					before = i;
					break;
				}
			}
			for(int i = key+1; i < ans.length(); i++){
				if( !Character.isDigit(ans.charAt(i)) ){
					after = i;
					break;					
				}
			}
			temp.append(ans.toString().substring(0, before+1));
			int x = Integer.parseInt(ans.toString().substring(before+1, key));
			int y = Integer.parseInt(ans.toString().substring(key+1, after));
			switch( ans.charAt(key) ){
				case '*' : temp.append(x*y); break;
				case '/' : temp.append(x/y); break;
				case '+' : temp.append(x+y); break;
				case '-' : temp.append(x-y); break;
			}
			temp.append(ans.toString().substring(after));
			ans = new StringBuilder(temp);
		}
		return Integer.parseInt(ans.toString());
		
	}
					
	public int step(String str){
		StringBuilder ans = new StringBuilder(str);
		ans.deleteCharAt(ans.length()-1);
		while( true ){
			StringBuilder temp = new StringBuilder();
			int n = ans.indexOf(")");
			int m = ans.lastIndexOf("(", n);
			if( n < 0 ){
				break;
			}
			temp.append(ans.toString().substring(0, m));
			temp.append(calculate(ans.toString().substring(m+1, n)));
			temp.append(ans.toString().substring(n+1, ans.length()));
			ans = new StringBuilder(temp);
		//	System.out.println(ans);
		}
		return calculate(ans.toString());
	}
	public void solve() throws IOException{
		int n = nextInt();
		while( n-- > 0 ){
			String str = nextToken();
			System.out.println(step(str));		
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