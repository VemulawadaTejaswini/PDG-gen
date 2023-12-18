import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			long n = Long.parseLong(reader.readLine());
			
			for (long i = 0; i < n; i ++) {
				String[] command = reader.readLine().split(" ");
				if (command.length == 1) {
					if (command[0].charAt(6) == 'F') {
						list.remove();
					} else {
						list.removeLast();
					}
				} else if (command[0].charAt(0) == 'd') {
					list.remove(command[1]);
				} else {
					list.addFirst(command[1]);
				}
			}
			
			reader.close();
		} catch (Exception e) {
		}
		
		for (int i = 0; i < list.size() - 1; i++) {
			System.out.print(list.get(i));
			System.out.print(" ");
		}
		System.out.println(list.getLast());
	}
} 

