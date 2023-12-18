import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Stack;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		
		int n, index, count;
		double point[][];
		while(!(string = reader.readLine()).equals("0")){
			n = Integer.valueOf(string);
			if(n == 3){ continue; }
			
			point = new double[n][2];
			
			string = reader.readLine();
			index = 0;
			point[0][0] = Double.valueOf(string.split(",")[0]);
			point[0][1] = Double.valueOf(string.split(",")[1]);
			for(int i = 1; i < n; i++){
				string = reader.readLine();
				point[i][0] = Double.valueOf(string.split(",")[0]);
				point[i][1] = Double.valueOf(string.split(",")[1]);
				
				if(point[i][1] < point[index][1]){
					index = i;
				}else if(point[i][1] == point[index][1] &&
						 point[i][0] < point[index][0]){
					index = i;
				}
			}
			
			PriorityQueue<Party> que = new PriorityQueue<Party>();
			for(int i = 0; i < n; i++){
				if(i != index){
					double radians = Math.atan2((point[i][1] - point[index][1]),
												 point[i][0] - point[index][0]);
				
					Party pair = new Party(radians, point[i]);
					que.add(pair);
				}
			}
			
			Stack<Pair> stack = new Stack<Pair>();
			stack.push(new Pair(que.peek().x, que.poll().y));
			stack.push(new Pair(que.peek().x, que.poll().y));
			count = 0;
			while(!que.isEmpty()){
				Pair p1 = stack.pop();
				Pair p2 = stack.pop();
				
				double radians = Math.atan2(p1.y - p2.y, p1.x - p2.x);
				if(radians < 0){
					count++;
				}
				
				stack.push(p1);
				stack.push(p2);
				stack.push(new Pair(que.peek().x, que.poll().y));
			}
			System.out.println(count);
		}
		reader.close();
	}
}

class Party implements Comparable<Party>{
	double radians;
	double x;
	double y;
	
	Party(double radians, double point[]){
		this.radians = radians;
		this.x = point[0];
		this.y = point[1];
	}

	@Override
	public int compareTo(Party o){
		return radians - o.radians < 0 ? -1 : 1;
	}
}

class Pair{
	double x;
	double y;
	
	Pair(double x, double y){
		this.x = x;
		this.y = y;
	}
}