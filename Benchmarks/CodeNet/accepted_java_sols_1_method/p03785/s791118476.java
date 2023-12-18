import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) { //WOOOOOOO AtCoder is HELPING!!!!!!!!!!
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		ArrayList<Integer> times = new ArrayList<Integer>();
		long cap = input.nextLong();
		long extra = input.nextLong();
		long ans = 0;
		for (int i = 0; i < N; i++) {
			times.add(input.nextInt());
		}
		Collections.sort(times);
		while (times.size()>0) {
			int curSTART = times.get(0);
			int curPpl = 1;
			int curTime = curSTART;
			times.remove(new Integer(times.get(0)));
			while (curTime <= curSTART+extra&&curPpl<=cap) {
				if (times.size()==0) break;
				int x = times.get(0);
				curTime = x;
				curPpl++;
				if (curTime <= curSTART+extra&&curPpl<=cap) times.remove(new Integer(times.get(0)));
				else break;
			}
			ans++;
		}
		System.out.println(ans);
	}
}