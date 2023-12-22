import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<Integer>();
		Scanner insert = new Scanner(System.in);
		while(true){
			String line = insert.nextLine();
			if(line.equals("")) {
				break;
			}
			int lineInt = Integer.parseInt(line);
			input.add(lineInt);
		}
		insert.close();
		int i = 0;
		while(true) {
			ArrayList<Integer> team = new ArrayList<Integer>();
			int jagde = input.get(i);
			if(jagde == 0) {
				break;
			}
			int score = 0;
			for (int j = 1; j <= jagde; j++) {
				team.add(input.get(i + j));
				score = score + input.get(i + j);
			}
			score = score - Collections.max(team);
			score = score - Collections.min(team);
			System.out.println(String.valueOf(score / (jagde - 2)));
			i = i + jagde + 1;
		}
	}
}

