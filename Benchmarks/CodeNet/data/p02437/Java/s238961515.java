import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmpArray = br.readLine().split(" ");
		int n = Integer.parseInt(tmpArray[0]);
		int q = Integer.parseInt(tmpArray[1]);

		@SuppressWarnings("unchecked")
		PriorityQueue<Integer>[] queue = new PriorityQueue[n];
		for(int i = 0; i < n; i++){
			//降順に設定
			queue[i] = new PriorityQueue<Integer>(new Comparator<Integer	>() {
				@Override
				public int compare(Integer a, Integer b) {
					return b - a;
				}
			});
		}

		for(int i = 0; i < q; i++){
			tmpArray = br.readLine().split(" ");

			//insert
			if(tmpArray[0].equals("0")){
				int t = Integer.parseInt(tmpArray[1]);
				int x = Integer.parseInt(tmpArray[2]);

				queue[t].add(x);
			}
			//getMax
			else if(tmpArray[0].equals("1")){
				int t = Integer.parseInt(tmpArray[1]);

				if(!queue[t].isEmpty()){
					System.out.println(queue[t].peek());
				}
			}
			//deleteMax
			else {
				int t = Integer.parseInt(tmpArray[1]);

				if(!queue[t].isEmpty()){
					queue[t].poll();
				}
			}
		}

	}
}
