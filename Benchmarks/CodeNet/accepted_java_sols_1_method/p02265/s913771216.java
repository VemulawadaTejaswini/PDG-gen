import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		ArrayDeque<String> list = new ArrayDeque<String>();
		
		int n = Integer.parseInt(r.readLine());
		
		for (int i = 0; i < n; i++) {
			String[] s = r.readLine().split(" ");
			if (s[0].equals("delete")) {
				list.remove(s[1]);
			}else if (s[0].equals("insert")) {
				list.addFirst(s[1]);
			}else if (s[0].equals("deleteFirst")) {
				list.removeFirst();
			}else if (s[0].equals("deleteLast")) {
				list.removeLast();
			}
		}
		
		System.out.print(list.remove());
		while (list.isEmpty() == false) {
			System.out.print(" " + list.remove());
		}
		System.out.println();
		
		
	}
}
