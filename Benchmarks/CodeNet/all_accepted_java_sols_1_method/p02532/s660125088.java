import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArrayList<Character> result = new ArrayList<Character>();

		{
			String command;
			ArrayList<ArrayDeque<Character>> color = new ArrayList<ArrayDeque<Character>>();
			for (int i = 0; i < n; i++) {
				color.add(new ArrayDeque<Character>());
			}
			
			while(!((command = sc.next()).equals("quit"))){
				if (command.equals("push")){
					color.get(sc.nextInt() - 1).push(sc.next().charAt(0));
				}else if(command.equals("pop")){
					result.add(color.get(sc.nextInt() - 1).pop());
				} else if(command.equals("move")){
					Character c = color.get(sc.nextInt() - 1).pop();
					color.get(sc.nextInt() - 1).push(c);
				}
			}
		}

		for (Character el : result) {
			System.out.println(el);
		}
	}
}