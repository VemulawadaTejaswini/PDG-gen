import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ティツ?ェテ・ツ仰陛ァツ板淌ヲツ按静」ツ?陛」ツつ古」ツ?淌」ツδ。テ」ツつステ」ツδε」ツδ嘉」ツδサテ」ツつケテ」ツつソテ」ツδ?

		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextLine() && sc.nextInt() > 0) {
			
			int n = sc.nextInt();
			
			ArrayList<Game> games = new ArrayList<Game>(n);
			
			for (int i = 0; i < n; i++) {
				games.add((new Game(sc.nextInt(), sc.nextInt())));
			}
			
			int point_a = 0;
			int point_b = 0;
			Iterator<Game> it = games.iterator();
			while (it.hasNext()) {
				Game now = it.next();
				if (now.winner() == Winner.A)
					point_a += now.sum();
				else if (now.winner() == Winner.B)
					point_b += now.sum();
				else {
					point_a += now.a;
					point_b += now.b;
				}

			}
			System.out.println(point_a + " " + point_b);
		}
		
	}

	

}

class Game{
	int a;
	int b;
	
	public  Winner winner() {
		if(a > b) return Winner.A;
		else if(a == b) return Winner.draw;
		else return Winner.B;
	}
	
	public int sum() {
		return a + b;
	}

	public Game(int a, int b) {
		this.a = a;
		this.b = b;
	}
}