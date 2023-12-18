import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;
import java.awt.Point;

class Comp implements Comparator<Point>{
	public int compare(Point a,Point b){
		return a.x==b.x?a.y-b.y:a.x-b.x;
	}
}

class Main{
	boolean exists(List<Point> ps,Point key){
		return Collections.binarySearch(ps,key,new Comp())>=0;
	}
	int solve(List<Point> ps){
		Collections.sort(ps,new Comp());
		int res=0;
		for(int i=0;i<ps.size();i++) for(int j=i+1;j<ps.size();j++){
			int dx=ps.get(j).y-ps.get(i).y,dy=ps.get(i).x-ps.get(j).x;
			if(exists(ps,new Point(ps.get(i).x+dx,ps.get(i).y+dy)) && exists(ps,new Point(ps.get(j).x+dx,ps.get(j).y+dy)))
				res=Math.max(res,dx*dx+dy*dy);
		}
		return res;
	}
	void run()throws IOException{
		for(int n;(n=nextInt())!=0;){
			List<Point> ps=new ArrayList<Point>(n);
			for(int i=0;i<n;i++)
				ps.add(new Point(nextInt(),nextInt()));
			writer.println(solve(ps));
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