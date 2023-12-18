import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmpArray = br.readLine().split(" ");
		int n = Integer.parseInt(tmpArray[0]);
		int q = Integer.parseInt(tmpArray[1]);

		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] queue = new ArrayList[n];
		for(int i = 0; i < n; i++){
			queue[i] = new ArrayList<Integer>();
		}

		for(int i = 0; i < q; i++){
			tmpArray = br.readLine().split(" ");

			//enqueue
			if(tmpArray[0].equals("0")){
				int t = Integer.parseInt(tmpArray[1]);
				int x = Integer.parseInt(tmpArray[2]);

				queue[t].add(x);
			}
			//front
			else if(tmpArray[0].equals("1")){
				int t = Integer.parseInt(tmpArray[1]);

				if(!queue[t].isEmpty()){
					System.out.println(queue[t].get(0));
				}
			}
			//dequeue
			else {
				int t = Integer.parseInt(tmpArray[1]);

				if(!queue[t].isEmpty()){
					queue[t].remove(0);
				}
			}
		}

	}
}
