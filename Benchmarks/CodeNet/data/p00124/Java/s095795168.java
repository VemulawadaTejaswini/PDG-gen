import java.util.*;
import java.io.*;

public class Main {
	
	public void solve() throws IOException{
		int n;
		boolean flag = false;
		while( (n = nextInt()) != 0 ){
			if( flag ){
				writer.println();
			}
			flag = true;
			String[] name = new String[n];
			Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
			
			for(int i = 0; i < n; i++){
				name[i] = nextToken();
				int x = nextInt(), y = nextInt(), z = nextInt();
				temp.put(i, 3*x + z);
			}
			SortedMap<Integer, Integer> map = new TreeMap<Integer, Integer>(new MyComparator(temp));
			map.putAll(temp);
			for(Integer x : map.keySet()){
				writer.println(name[x] + "," + map.get(x));
			}
			writer.flush();
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
class MyComparator implements Comparator<Integer>{
	private Map<Integer, Integer> map;
	MyComparator(Map<Integer, Integer> map){
		this.map = map;
	}
	public int compare(Integer x, Integer y){
		int value1 = map.get(x);
		int value2 = map.get(y);
		if( value1 == value2 ){
			return x - y;
		}
		return value2 - value1;
	}
}