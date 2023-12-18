import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	
	public static class Plane {
		int height;
		int pos;
		
		public Plane(int height, int pos) {
			super();
			this.height = height;
			this.pos = pos;
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final char[] inputs = sc.next().toCharArray();
		
		int[] map = new int[inputs.length + 1];
		int[] max = new int[inputs.length + 1];
		map[0] = 0;
		
		int cnt = 1;
		for(char c: inputs){
			map[cnt] += map[cnt - 1] + (c == '/' ? 1 : c == '_' ? 0 : -1);
			cnt++;
		}
		
		max[map.length - 1] = map[map.length - 1];
		for(int i = map.length - 2; i >= 0; i--){
			max[i] = Math.max(max[i + 1], map[i]);
		}
		
		LinkedList<Plane> stack = new LinkedList<Plane>();
		LinkedList<Integer> area_list = new LinkedList<Integer>();
		
		int total_area = 0, cur_area = 0;
		for(int i = 1; i < map.length; i++){
			final int prev_diff = map[i] - map[i - 1];
			
			if(prev_diff > 0 && !stack.isEmpty()){
				Plane before = stack.removeFirst();
				total_area += (i - before.pos);
				cur_area += (i - before.pos);
				
				if(stack.isEmpty() || max[i] <= map[i]){
					area_list.add(cur_area);
					cur_area = 0;
				}
				
			}else if(prev_diff < 0){
				stack.addFirst(new Plane(map[i], i));
			}
		}
		
		if(cur_area != 0){
			area_list.add(cur_area);
		}
		
		System.out.println(total_area);
		System.out.print(area_list.size());
		for(int i : area_list){
			System.out.print(" " + i);
		}
		System.out.println();
		
	}
	
	public static class Scanner {
	    private BufferedReader br;
	    private StringTokenizer tok;

	    public Scanner(InputStream is) throws IOException {
	        br = new BufferedReader(new InputStreamReader(is));
	    }

	    private void getLine() throws IOException {
	        while (!hasNext()) { tok = new StringTokenizer(br.readLine()); }
	    }

	    private boolean hasNext() {
	        return tok != null && tok.hasMoreTokens();
	    }

	    public String next() throws IOException {
	        getLine(); return tok.nextToken();
	    }

	    public int nextInt() throws IOException {
	        return Integer.parseInt(next());
	    }
	    
	    public long nextLong() throws IOException {
	    	return Long.parseLong(next());
	    }
	    
	    public void close() throws IOException {
	        br.close();
	    }
	}

}