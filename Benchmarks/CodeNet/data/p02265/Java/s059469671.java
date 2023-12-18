import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> ll = new ArrayDeque<Integer>(2000000);
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			String op = br.readLine();
			
			if (op.startsWith("insert")) {
				int num = Integer.parseInt(op.substring(7));
				ll.offerFirst(num);
			}
			else if (op.startsWith("deleteLast")) {
				ll.pollLast();
			}
			else if (op.startsWith("deleteFirst")){
				ll.pollFirst();
			}
			else {
				int num = Integer.parseInt(op.substring(7));
				ll.remove((Integer)num);
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append(ll.poll());
		for (Integer num : ll) {
			sb.append(" ").append(num);
		}
		System.out.println(sb.toString());
		
		br.close();
	}

}