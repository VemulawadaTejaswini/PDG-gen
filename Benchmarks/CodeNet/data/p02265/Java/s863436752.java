import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws IOException {
		
//		Scanner sc = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
//		int n = sc.nextInt();
		int n = Integer.parseInt(reader.readLine());
		
		Deque<Integer> list = new ArrayDeque<Integer>(1000000);
		for (int i = 0; i < n; i++) {
//			String command = sc.next();
			String cmd = reader.readLine();

			if ('i' == cmd.charAt(0)) {
				list.addFirst(Integer.parseInt(cmd.substring(7)));
			} else if ('F' == cmd.charAt(6)) {
				list.pollFirst();
			} else if ('L' == cmd.charAt(6)) {
				list.pollLast();
			} else {
				list.remove(Integer.parseInt(cmd.substring(7)));
			}			
		}
//		sc.close();	
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer value = itr.next();
			System.out.print(value);
			if (itr.hasNext()) {
				System.out.print(" ");
			}
		}
		System.out.println("");
	}	
}
