import java.util.*;
import java.io.*;

public class Main{
	final static int MOD = 1000000007;
	final static int INF = 1000000000;

	public static void main(String[] args) throws IOException{
		NScanner sc = new NScanner(System.in);
		String s = sc.next();
		//'\'の位置
		Deque<Integer> Slt = new ArrayDeque<Integer>();
		//
		Deque<Pond> Spnd = new ArrayDeque<Pond>();
		int sumArea = 0;
		for(int i = 0; i < s.length(); ++i){
			if(s.charAt(i) == '_') continue;
			if(s.charAt(i) == '\\')
				Slt.push(i);
			else if(s.charAt(i) == '/' && Slt.size() > 0){
				int j = Slt.pop();
				int a = i - j; sumArea += a;
				while(Spnd.size() > 0 && Spnd.getLast().getLeft() > j){
					a += Spnd.pollLast().getArea();
				}
				Spnd.addLast(new Pond(j, a));
			}
		}
		
		System.out.println(sumArea);
		System.out.print(Spnd.size());
		for(Pond p: Spnd){
			System.out.printf(" %d", p.getArea());
		}
		System.out.println();
	}
	
	static class Pond{
		int left; int area;
		public Pond(int l, int a){
			left = l; area = a;
		}
		public void setLeft(int l){
			left = l;
		}
		public int getLeft(){
			return left;
		}
		public void setArea(int a){
			area = a;
		}
		public int getArea(){
			return area;
		}
	}


}

class NScanner {

	private BufferedReader br;
	private StringTokenizer tok;

	public NScanner(InputStream is) throws IOException{
		br = new BufferedReader(new InputStreamReader(is));
		getLine();
	}

	private void getLine() throws IOException{
		while(tok == null || !hasNext()){
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
