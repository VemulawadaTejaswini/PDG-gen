import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

class Main{
	void run()throws IOException{
		for(int a,b;hasNext();){
			a=nextInt();
			b=nextInt();
			writer.println(a+b);
		}
	}
	
	// ---------- begin template ----------
	BufferedReader reader;
	StringTokenizer tokenizer;
	PrintWriter writer;
	
	boolean hasNext()throws IOException{
		while(tokenizer==null || !tokenizer.hasMoreTokens()){
			String s=reader.readLine();
			if(s==null)
				return false;
			tokenizer=new StringTokenizer(s);
		}
		return true;
	}
	String next()throws IOException{
		while(tokenizer==null || !tokenizer.hasMoreTokens())
			tokenizer=new StringTokenizer(reader.readLine());
		return tokenizer.nextToken();
	}
	int nextInt()throws IOException{
		return Integer.parseInt(next());
	}
	long nextLong()throws IOException{
		return Long.parseLong(next());
	}
	double nextDouble()throws IOException{
		return Double.parseDouble(next());
	}
	BigInteger nextBigInteger()throws IOException{
		return new BigInteger(next());
	}
	void main(){
		try{
			reader=new BufferedReader(new InputStreamReader(System.in));
			tokenizer=null;
			writer=new PrintWriter(System.out);
			run();
			reader.close();
			writer.close();
		}
		catch(Exception e){
			e.printStackTrace();
			System.exit(1);
		}
	}
	public static void main(String[] args){
		new Main().main();
	}
	// ---------- end template ----------
}