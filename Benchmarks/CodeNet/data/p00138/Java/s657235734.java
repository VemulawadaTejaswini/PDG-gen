import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		PriorityQueue<Pair> que = new PriorityQueue<Pair>();
		int INT;
		double DOB;
		for(int i = 0; i < 3; i++){
			PriorityQueue<Pair> hoge = new PriorityQueue<Pair>();
			for(int j = 0; j < 8; j++){
				String str[] = reader.readLine().split(" ");
				INT = Integer.valueOf(str[0]);
				DOB =  Double.valueOf(str[1]);
				hoge.add(new Pair(DOB, INT));
			}
			System.out.println(hoge.peek().INT + " " + hoge.poll().DOB);
			System.out.println(hoge.peek().INT + " " + hoge.poll().DOB);
			
			while(!hoge.isEmpty()){ que.add(hoge.poll()); }
		}
		System.out.println(que.peek().INT + " " + que.poll().DOB);
		System.out.println(que.peek().INT + " " + que.poll().DOB);
		
		reader.close();
	}
}

class Pair implements Comparable<Pair>{
	int INT;
	double DOB;
	Pair(double DOB, int INT){
		this.INT = INT;
		this.DOB = DOB;
	}
	@Override
	public int compareTo(Pair e) {
		return DOB < e.DOB ? -1 : 1;
	}
}