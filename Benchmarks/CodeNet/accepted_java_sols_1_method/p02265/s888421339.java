import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringJoiner;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new ArrayDeque<>();
		
		for(int i = 0; i < n; i++){
			String[] strs = br.readLine().split(" ");
			String command = strs[0];
			int num = 0;
			if(strs.length == 2){
				num = Integer.parseInt(strs[1]);
			}
			
			switch (command) {
			case "insert":
				deque.offerFirst(num);
				break;
			case "delete":
				deque.remove(num);
				break;
			case "deleteFirst":
				deque.removeFirst();
				break;
			case "deleteLast":
				deque.removeLast();
				break;
			}
		}
		
		StringJoiner sj = new StringJoiner(" ");
		deque.forEach(s -> sj.add(String.valueOf(s)));
		System.out.println(sj);
	}
}

