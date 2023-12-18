import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		char[] line = scanner.next().toCharArray();

		Deque<Character> q = new ArrayDeque<Character>();

		for (int i = 0; i < line.length; i++) {
			if (line[i] == '0') {
				q.addLast('0');
			} else if(line[i] == '1'){
				q.addLast('1');
			} else if(line[i] == 'B'){
				if (q.size() != 0) {
					q.removeLast();
				} 
			}
		}

		for (Character character : q) {
			System.out.print(character);
		}

		System.out.println();

		scanner.close();
	}

}
