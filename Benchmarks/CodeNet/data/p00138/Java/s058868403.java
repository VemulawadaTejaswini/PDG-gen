import java.lang.reflect.Array;
import java.util.*;
public class Main {
	Runner[] runner = new Runner[8];//????????\????????????
	Runner[] winner = new Runner[6];//????????????1?????¨???????????\??????
	Runner[] loser = new Runner[18];//?????????3?????\????????\????????????
	void doIt(){
		Scanner sc = new Scanner(System.in);
		int l = 0, w = 0;//loser,winner????¨???¶??¨
		int num;
		String time;
		for(int pare = 0; pare < 3; pare++){
			for(int run = 0; run < runner.length; run++){
				num = sc.nextInt();
				time = sc.next();
				runner[run] = new Runner(num,time);
			}
			Arrays.sort(runner);
			for(int win = 0; win < winner.length/3; win++){
				winner[w] = runner[win];
				w++;
			}
			for(int lose = 0; lose < loser.length/3; lose++){
				loser[l] = runner[lose+2];
				l++;
			}
		}
		Arrays.sort(loser);
		for(int i = 0; i < winner.length; i++){
			System.out.println(winner[i].num + " " + winner[i].time);
		}
		System.out.println(loser[0].num + " " + loser[0].time);
		System.out.println(loser[1].num + " " + loser[1].time);
	}
	public static void main(String[] args){
		new Main().doIt();
	}
	class Runner implements Comparable<Runner>{
		int num;
		String time;
		Runner(int num, String time) {
			this.num = num;
			this.time = time;
		}
		@Override
		public int compareTo(Runner r){
			return time.compareTo(r.time);
		}
	}
}