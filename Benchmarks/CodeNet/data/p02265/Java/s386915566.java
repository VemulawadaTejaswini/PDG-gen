

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		Deque<Integer> deque = new LinkedList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int t = 0; t < n; t++){
			String input = sc.next();
			
			if("insert".equals(input)){
				final int x = sc.nextInt();
				
				deque.addFirst(x);
				if(!map.containsKey(x)){
					map.put(x, 1);
				}else{
					map.put(x, map.get(x) + 1);
				}
			}else if("delete".equals(input)){
				final int x = sc.nextInt();
				
				if(map.containsKey(x) && map.get(x) > 0){
					deque.remove(x);
					map.put(x, map.get(x) - 1);
				}
				
			}else if("deleteFirst".equals(input)){
				final int x = deque.pollFirst();
				
				map.put(x, map.get(x) - 1);
			}else if("deleteLast".equals(input)){
				final int x = deque.pollLast();
				
				map.put(x, map.get(x) - 1);
			}
		}
		
		boolean first = true;
		for(int i : deque){
			System.out.print((first ? "" : " ") + i);
			
			if(first){
				first = false;
			}
		}
		System.out.println();
		
	}

}

class Scanner {
	
	private BufferedReader br;
	private StringTokenizer tok;
	
	public Scanner(InputStream is) throws IOException{
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