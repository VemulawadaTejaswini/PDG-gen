import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();
		int size = Integer.parseInt(line);
		List<Cards> data = new ArrayList<Cards>();
		for(int i=0; i<size; i++){
			line = in.readLine();
			String[] tmp = line.split(" ");
			long a = Long.parseLong(tmp[0]);
			long b = Long.parseLong(tmp[1]);
			data.add(new Cards(a, b));
		}
		
		long cost = 0;
		cost = get_cost(data, cost);
		
		System.out.println(cost);
	}
	
	public long get_cost(List<Cards> data, long cost){
		if(data.size() > 1){
			long min = Long.MAX_VALUE;
			for(int n=0; n<data.size()-1; n++){
				long c = Cards.join_cost(data.get(n), data.get(n+1));
				List<Cards> temp = new ArrayList<Cards>(data);
				temp.set(n+1, Cards.join(data.get(n), data.get(n+1)));
				temp.remove(n);
				long m = get_cost(temp, cost+c); 
				if(min > m){
					min = m;
				}
			}
			return min;
		}else{
			return cost;
		}
	}
}