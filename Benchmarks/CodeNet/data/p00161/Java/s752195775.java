
import java.util.*;
public class Main {

	class Team implements Comparable<Team>{
		int number;
		int time;

		public Team(int num, int hour, int sec){
			this.number = num;
			int temphour = hour + sec / 60;
			int tempsec = sec % 60;
			this.time = temphour * 100 + tempsec;
		}

		public int compareTo(Team team) {
			if(this.time < team.time){
				return -1;
			}
			if(this.time > team.time){
				return 1;
			}
			return 0;
		}

	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n != 0){
			Team [] list = new Team[n];
			int num = 0;
			for(int i=0; i < n; i++){
				num = sc.nextInt();
				int sumh = 0, sums = 0;
				for(int j=0; j < 4; j++){
					sumh += sc.nextInt();
					sums += sc.nextInt();
				}
				list[i] = new Team(num, sumh, sums);
			}
			Arrays.sort(list);
			System.out.println(list[0].number);
			System.out.println(list[1].number);
			System.out.println(list[list.length - 2].number);

			n = sc.nextInt();
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}