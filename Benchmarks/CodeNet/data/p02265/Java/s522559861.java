import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		ArrayDeque<String> q = new ArrayDeque<String>();
		
		try {
			int lim = Integer.parseInt(in.readLine());
			
			for (int i = 0; i < lim; i++) {
				String[] str = in.readLine().split(" ");
				
				if (str[0].equals("insert")) {
					q.addFirst(str[1]);
				} else if (str[0].equals("delete")) {
					q.remove(str[1]);
				} else if (str[0].equals("deleteFirst")) {
					q.removeFirst();
				} else {
					q.removeLast();
				}
			}
			
			System.out.print(q.remove());
			while (q.isEmpty() == false) {
				System.out.print(" " + q.remove());
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}