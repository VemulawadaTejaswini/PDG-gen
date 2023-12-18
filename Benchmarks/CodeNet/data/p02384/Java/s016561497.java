import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] data = in.readLine().split(" ");
		int[] num = new int[6];
		for (int i = 0; i < 6; i++) {
			num[i] = Integer.parseInt(data[i]);
		}
		Dices dice = new Dices(num[0], num[1], num[2], num[3], num[4], num[5]);
		int quesTime = Integer.parseInt(in.readLine());
		for (int j = 0; j < quesTime; j++) {
			String[] ques = in.readLine().split(" ");
			int top = Integer.parseInt(ques[0]);
			int front = Integer.parseInt(ques[1]);
			if ((top == dice.fo && front == dice.tw)
					|| (top == dice.tw && front == dice.th)
					|| (top == dice.th && front == dice.fi)
					|| (top == dice.fi && front == dice.fo)) {
				System.out.println(dice.on);
			} else if ((top == dice.on && front == dice.fo)
					|| (top == dice.fo && front == dice.si)
					|| (top == dice.si && front == dice.th)
					|| (top == dice.th && front == dice.on)) {
				System.out.println(dice.tw);
			} else if ((top == dice.on && front == dice.tw)
					|| (top == dice.tw && front == dice.si)
					|| (top == dice.si && front == dice.fi)
					|| (top == dice.fi && front == dice.on)) {
				System.out.println(dice.th);
			} else if ((top == dice.si && front == dice.tw)
					|| (top == dice.tw && front == dice.on)
					|| (top == dice.on && front == dice.fi)
					|| (top == dice.fi && front == dice.si)) {
				System.out.println(dice.fo);
			} else if ((top == dice.fo && front == dice.on)
					|| (top == dice.on && front == dice.th)
					|| (top == dice.th && front == dice.si)
					|| (top == dice.si && front == dice.fo)) {
				System.out.println(dice.fi);
			} else if ((top == dice.tw && front == dice.fo)
					|| (top == dice.fo && front == dice.fi)
					|| (top == dice.fi && front == dice.th)
					|| (top == dice.th && front == dice.tw)) {
				System.out.println(dice.si);
			}
		}
	}
}

class Dices2 {
	public int on, tw, th, fo, fi, si;

	public Dices2(int on, int tw, int th, int fo, int fi, int si) {
		this.on = on;
		this.tw = tw;
		this.th = th;
		this.fo = fo;
		this.fi = fi;
		this.si = si;
	}
}