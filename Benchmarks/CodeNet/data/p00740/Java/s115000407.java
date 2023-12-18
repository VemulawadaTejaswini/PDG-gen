import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		while (stdin.hasNextLine()){
			int n = stdin.nextInt();
			int p = stdin.nextInt();
			if (n == 0 && p == 0) break;
			Game g = new Game(n, p);
			System.out.println(g.winner());
		}
		System.exit(0);
	}
}

class Player {
	private int pebbles = 0;
	public boolean hasPebbles() {
		return pebbles != 0 ? false : true;
	}
	public int getPebbles() {
		return pebbles;
	}
	public int putPebbles() {
		int tmp = pebbles;
		pebbles = 0;
		return tmp;
	}
	public void takePebble(){
		pebbles++;
	}
}

class Bowl {
	private int pebbles;
	public Bowl(int pebbles) {
		this.pebbles = pebbles;
	}
	public int getPebbles() {
		return pebbles;
	}
	public void draw(Player player) {
		if (pebbles == 0) {
			pebbles += player.putPebbles();
		}
		else {
			player.takePebble();
			pebbles--;
		}
	}
}

class Game {
	private Player[] players;
	private Bowl bowl;
	private int p;
	public Game(int n, int p){
		players = new Player[n];
		for (int i = 0; i < n; i++) {
			players[i] = new Player();
		}
		bowl = new Bowl(p);
		this.p = p;
	}

	public int winner() {
		int i = 0;
		while(! finished()) {
			bowl.draw(players[i]);
			i = (i + 1) % players.length;
		}
		if (--i < 0) i = players.length - 1;
		return i;
	}

	private boolean finished() {
		for (int  i = 0; i < players.length; i++) {
			int p = players[i].getPebbles();
			if (p == this.p) return true;
			if (p > 0) return false;
		}
		return false;
	}
}