
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			Team[] teams = new Team[n];
			for(int i = 0;i<n;i++){
				String name = scanner.next();
				int win =0;
				int lose = 0;
				for(int j = 0;j<n-1;j++){
					int a = scanner.nextInt();
					if(a==0)
						win++;
					else if(a==1)
						lose++;
				}
				teams[i] = new Team(name, win, lose);
			}
			Arrays.sort(teams);
			for(Team t:teams)
				System.out.println(t.name);
			
			

		}
	}

	class Team implements Comparable<Team> {
		String name;
		int win;
		int lose;
		
		


		public Team(String name, int win, int lose) {
			super();
			this.name = name;
			this.win = win;
			this.lose = lose;
		}




		@Override
		public int compareTo(Team o) {
			if (this.win == o.win)
				return this.lose - o.lose;
			return o.win - this.win;
		}

	}
}