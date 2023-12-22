import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String command;
		ArrayDeque<String> color = new ArrayDeque<String>();
		ArrayList<String> result = new ArrayList<String>();

		while(!(( command = sc.next()).equals("quit"))){
			if (command.equals("push")){
				color.push(sc.next());
			}else if(command.equals("pop")){
				result.add(color.pop());
			}
		}

		for (String el : result) {
			System.out.println(el);
		}
	}
}