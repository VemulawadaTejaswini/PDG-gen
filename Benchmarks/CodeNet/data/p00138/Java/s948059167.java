import java.util.*;

public class Main {
	void doIt(){
		Scanner sc = new Scanner(System.in);
		Player[] p = new Player[8];
		Player[] pp = new Player[6];

		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 8; j++) {
				p[j] = new Player(sc.nextInt(), sc.next());
			}
			Arrays.sort(p);
			for(int j = 0; j < 2; j++) {
				System.out.println(p[j].num + " " + p[j].time);
				pp[i * 2 + j] = p[j + 2];
			}
		}
		Arrays.sort(pp);
		for(int i = 0; i < 2; i++){
			System.out.println(pp[i].num + " " + pp[i].time);
		}
	}

	class Player implements Comparable<Player>{
		int num;
		String time;
		Player(int num, String time){
			this.num = num;
			this.time = time;
		}
		@Override
		public int compareTo(Player p) {
			return time.compareTo(p.time);
		}
	}

	public static void main(String[] args){
		new Main().doIt();
	}

}