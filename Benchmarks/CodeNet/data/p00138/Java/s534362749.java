public class Main {
	void doIt(){
		Runner[] runner = new Runner[8];//????????\????????????
		Runner[] loser = new Runner[18];//?????????3?????\????????\????????????
		Scanner sc = new Scanner(System.in);
		int c = 0;//loser????¨???¶??¨
		int num;
		String time;
		for(int pare = 0; pare < 3; pare++){
			for(int run = 0; run < runner.length; run++){
				num = sc.nextInt();
				time = sc.next();
				runner[run] = new Runner(num,time);
			}
			Arrays.sort(runner);
			System.out.println(runner[0].num + " " + runner[0].time);
			System.out.println(runner[1].num + " " + runner[1].time);
			for(int lose = 0; lose < loser.length/3; lose++){
				loser[c] = runner[lose+2];
				c++;
			}
		}
		Arrays.sort(loser);
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