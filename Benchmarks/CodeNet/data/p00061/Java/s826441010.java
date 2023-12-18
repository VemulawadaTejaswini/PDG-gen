import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static class Team {
		int number;
		int score;
		int rank;
		
		Team(Integer number, Integer score) {
			this.number = number;
			this.score = score;
		}

		public String toString() {
			return "{number: " + number + "score: " + score + "rank: " + rank + "}";
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str[];
		ArrayList<Team> team = new ArrayList<Team>();
		int count;
		
		count = 0;
		while (true) {
			str = sc.next().split(",");
			if (str[0].equals("0") && str[1].equals("0")) {
				break;
			}
			team.add(new Team(Integer.valueOf(str[0]), Integer.valueOf(str[1])));
			count++;
		}
		quickSort(team, 0, count - 1);
		team.get(0).rank = 1;
		for (int i = 1; i < team.size(); i++) {
			if (team.get(i).score == team.get(i - 1).score) {
				team.get(i).rank = team.get(i - 1).rank;
			} else {
				team.get(i).rank = team.get(i - 1).rank + 1;
			}
		}
		while (sc.hasNext()) {
			int a = sc.nextInt();
			for (int i = 0; i < team.size(); i++) {
				if (team.get(i).number == a) {
					System.out.println(team.get(i).rank);
				}
			}
		}
	}
	
	public static void quickSort(ArrayList<Team> team, int low, int high) {
		if (high <= low) {
			return ;
		}
		int i = low;
		int j = high;
		int x = team.get((low + high) / 2).score;
		while (i <= j) {
			while (x < team.get(i).score) {
				i++;
			}
			while (team.get(j).score < x) {
				j--;
			}
			if (i <= j) {
				Team swap = new Team(team.get(i).number, team.get(i).score);
				team.get(i).score = team.get(j).score;
				team.get(i).number = team.get(j).number;
				team.get(j).score = swap.score;
				team.get(j).number = swap.number;
				i++;
				j--;
			}
		}
		quickSort(team, low, j);
		quickSort(team, i, high);
	}
}