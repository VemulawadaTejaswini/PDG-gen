import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		int n, point;
		
		while(!(string = reader.readLine()).equals("0")){
			PriorityQueue<Pair> que = new PriorityQueue<Pair>();
			n = Integer.valueOf(string);
			
			for(int i = 0; i < n; i++){
				string = reader.readLine();
				point = Integer.valueOf(string.split(" ")[1]) * 3 + 
						Integer.valueOf(string.split(" ")[3]);
				que.add(new Pair(point, string.split(" ")[0]));
			}
			while(!que.isEmpty()){
				Pair pair = que.poll();
				System.out.println(pair.b + "," + pair.a);
			}
			System.out.println();
		}
		reader.close();
	}
}

class Pair implements Comparable<Pair>{
	int a;
	String b;
	Pair(int a, String b){
		this.a = a;
		this.b = b;
	}
	@Override
	public int compareTo(Pair o) {
		return o.a - a;
	}
}