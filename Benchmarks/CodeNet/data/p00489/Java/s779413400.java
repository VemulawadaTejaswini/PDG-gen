import java.util.Scanner;
public class Main {

	static void add_point(int[] point, int a, int b, int ascore, int bscore) {
		int diff = ascore - bscore;
		if(diff == 0) {
			point[a]++;
			point[b]++;
		} else if(diff > 0)
			point[a] += 3;
		else
			point[b] += 3;
	}
	
	static void print_rank(int[] point) {
		int[] rank = new int[point.length];
		int idx = 0, count = 1;
		
		for(int r = 0; r < point.length; r++) {
			int max = point[0];
			for(int c = 0; c < point.length; c++) {
				if(point[c] > max) {
					max = point[c];
					idx = c;
				}
			}
			for(int c = idx; c < point.length; c++) {
				final int cnt = count;
				if(point[c] == max) {
					rank[c] = cnt;
					point[c] = -1;
					if(c != idx) count++;
				}
			}
			count++;
		}
		
		for(int r = 1; r < point.length; r++) {
			System.out.println(rank[r]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		int team = stdIn.nextInt();
		int[] point = new int[team + 1];
		final int match_num = team * (team - 1) / 2;
		//System.out.println(match_num); DEBUG
		for(int r = 0; r < point.length; r++)
			point[r] = 0;
		
		for(int r = 0; r < match_num; r++) {
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			int ascore = stdIn.nextInt();
			int bscore = stdIn.nextInt();
			
			add_point(point, a, b, ascore, bscore);
		}
		print_rank(point);
	}

}