import java.util.*;

public class Main {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		long n = scanner.nextLong();
		scanner.nextLine();
		
		for (long i = 0; i < n; i ++) {
			String command = scanner.nextLine();
			if (command.charAt(6) == 'F') {
				list.remove();
			} else if (command.charAt(6) == 'L') {
				list.removeLast();
			} else if (command.charAt(0) == 'd') {
				Integer x = Integer.valueOf(command.substring(7).intern());
				list.remove(x);				
			} else {
				Integer x = Integer.valueOf(command.substring(7).intern());
				list.addFirst(x);
			}
		}
		
		scanner.close();
		
		for (int i = 0; i < list.size() - 1; i++) {
			System.out.print(list.get(i));
			System.out.print(" ");
		}
		System.out.println(list.getLast());
	}
} 

