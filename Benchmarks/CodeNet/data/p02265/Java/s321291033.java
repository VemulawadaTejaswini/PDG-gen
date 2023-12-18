import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		ALDS1_3_C();
	}

	public static void ALDS1_3_C() {

		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<String> link = new ArrayDeque<String>();
		String input_str[] = new String[2];
		try {
			int n = Integer.parseInt(br.readLine());
			for(int i = 0; i < n; i++) {
				//String command = sc.next();
				input_str = br.readLine().split("\\s+");
				if(input_str[0].equals("insert")) {
					link.addFirst(input_str[1]);
				}else if(input_str[0].equals("delete")) {
					link.remove(input_str[1]);
				}else if(input_str[0].equals("deleteFirst")) {
					link.removeFirst();
				}else if(input_str[0].equals("deleteLast")) {
					link.removeLast();
				}

			}

			String tmp;
			boolean notFirst = false;
			while((tmp = link.poll()) != null) {
				if(notFirst)
					System.out.print(" ");
				System.out.print(tmp);
				notFirst = true;
			}
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

