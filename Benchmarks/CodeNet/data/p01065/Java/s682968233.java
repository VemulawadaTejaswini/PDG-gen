import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		final int x = sc.nextInt();
		final int y = sc.nextInt();
		
		Map<Integer, Map<Integer, Integer>> DP = new HashMap<Integer, Map<Integer, Integer>>();
		Map<Integer, Map<Integer, Integer>> nextDP = new HashMap<Integer, Map<Integer, Integer>>();
		
		DP.put(x, new HashMap<Integer, Integer>());
		DP.get(x).put(y, 0);
		
		for(int i = 0; i < n; i++){
			nextDP.clear();
			for(Entry<Integer, Map<Integer, Integer>> entry : DP.entrySet()){
				nextDP.put(entry.getKey(), new HashMap<Integer, Integer>(entry.getValue()));
			}
			
			final int a = sc.nextInt();
			final int b = sc.nextInt();
			final int c = sc.nextInt();
			final int d = sc.nextInt();
			
			for(Entry<Integer, Map<Integer, Integer>> entry : DP.entrySet()){
				final int x_value = entry.getKey();
				if(x_value < 0){ continue; }
				
				final int next_x_value = x_value - a;
				if(!nextDP.containsKey(next_x_value)){
					nextDP.put(next_x_value, new HashMap<Integer, Integer>());
				}
				
				for(Entry<Integer, Integer> inner_entry : entry.getValue().entrySet()){
					final int y_value = inner_entry.getKey();
					final int next_y_value = y_value + b;
					
					if(!nextDP.get(next_x_value).containsKey(next_y_value)){
						nextDP.get(next_x_value).put(next_y_value, 0);
					}
					
					final int prev_result = inner_entry.getValue();
					final int curr_result = nextDP.get(next_x_value).get(next_y_value);
					
					nextDP.get(next_x_value).put(next_y_value, 
							Math.max(prev_result, curr_result));
				}
			}
			
			for(Entry<Integer, Map<Integer, Integer>> entry : DP.entrySet()){
				final int x_value = entry.getKey();
				
				for(Entry<Integer, Integer> inner_entry : entry.getValue().entrySet()){
					final int y_value = inner_entry.getKey();
					final int next_y_value = y_value - c;
					
					if(!nextDP.get(x_value).containsKey(next_y_value)){
						nextDP.get(x_value).put(next_y_value, 0);
					}
					
					final int prev_result = nextDP.get(x_value).get(next_y_value);
					final int curr_result = inner_entry.getValue() + d;
					
					nextDP.get(x_value).put(next_y_value, 
							Math.max(prev_result, curr_result));
				}
			}
			
			{
				Map<Integer, Map<Integer, Integer>> tmp = DP;
				DP = nextDP;
				nextDP = tmp;
			}
		}
		
		int max = 0;
		for(Entry<Integer, Map<Integer, Integer>> entry : DP.entrySet()){
			final int x_value = entry.getKey();
			if(x_value < 0){ continue; }
			
			for(Entry<Integer, Integer> inner_entry : entry.getValue().entrySet()){
				final int y_value = inner_entry.getKey();
				if(y_value < 0){ continue; }
				
				max = Math.max(max, inner_entry.getValue());
			}
		}
		
		System.out.println(max);
	}	
	
	public static class Scanner {
		private BufferedReader br;
		private StringTokenizer tok;
		
		public Scanner(InputStream is){
			br = new BufferedReader(new InputStreamReader(is));
		}
		
		private void getLine(){
			try{
				while(!hasNext()){
					tok = new StringTokenizer(br.readLine());
				}
			} catch (IOException e){
				
			}
		}
		
		private boolean hasNext(){
			return tok != null && tok.hasMoreTokens();
		}
		
		public String next(){
			getLine(); return tok.nextToken();
		}
		
		public int nextInt(){
			return Integer.parseInt(next());
		}
	}
}