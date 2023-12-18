import java.io.PrintWriter;
import java.util.Scanner;


public class Main {
	Scanner in = new Scanner(System.in);
	PrintWriter out = new PrintWriter(System.out);
	
	class State {
		int value;
		int day, minute;
		
		public State(int value) {
			this.value = value;
			day = value / 1440;
			minute = (value % 1440);
		}
		
		public State(State s, int value) {
			this((s.value + value) % 10080);
		}
	}
	
	public void run() {
		while (true) {
			int s = in.nextInt(), n = in.nextInt(), t = in.nextInt();
			String weekDay = in.next(), time = in.next();
			int p = in.nextInt(), m = in.nextInt();
			if (s == 0) break;
			
			String[] allWeekDay = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "sat"};
			String[] allTime = {"Day", "Night"};

			boolean[] okWeekDay = new boolean[7];
			boolean[] okTime = new boolean[2];
			for (int i = 0; i < 7; i++) {
				okWeekDay[i] = (allWeekDay[i].matches(weekDay) || weekDay.matches("All")) ? true : false;
			}
			for (int i = 0; i < 2; i++) {
				okTime[i] = (allTime[i].matches(time) || time.matches("All")) ? true : false;
			}
			
			double res = Double.MIN_VALUE;
			for (int i = 0; i < 10080; i++) {
				//out.println("^^^^^" + i + "^^^^^^");
				State st = new State(i);
				double temp = 0;
				int allNum = 0;
				for (int j = 0; j < m; j++) {
					State nextState = new State(st, t * j + s);
					if (okWeekDay[nextState.day]) {
						if (okTime[0] && 360 <= nextState.minute && nextState.minute <= 1080) {
							allNum += n;
						} else if (okTime[1] && (nextState.minute <= 360 || 1080 <= nextState.minute)) {
							allNum += n;
						}
						//out.println(temp);
					}
				}
				temp += 1 - Math.pow((1 - 1.0 / p), allNum);
				res = Math.max(temp, res);
			}
		} 
		out.close();
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
}