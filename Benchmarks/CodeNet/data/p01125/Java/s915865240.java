
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//map of jewelries and check and pick it 
class Jewel {
	private int px, py;

	Jewel(Integer[] p) {
		px = p[0];
		py = p[1];
	}

	public boolean match(int lx, int ly) {
		if (px == lx && py == ly)
			return true;
		else
			return false;
	}

	public void picked() {
		px = -1;
		py = -1;
	}
}

// operate robot
class Robt {
	private int lx, ly;
	private int picked = 0;

	public void locate(int x, int y, Jewel[] jewel) {
		lx = x;
		ly = y;
	}

	private void moveOne(int dx, int dy, Jewel[] jewel) {
		lx += dx;
		ly += dy;
		for (int i = 0; i < jewel.length; i++)
			if (jewel[i].match(lx, ly)) {
				picked++;
				jewel[i].picked();
			}
	}

	public void move(String com, Jewel[] jewel) {
		String[] dd = com.split(" ");
		int dist = Integer.valueOf(dd[1]);
		for (int m = 0; m < dist; m++) {
			switch (dd[0]) {
			case ("N"):
				moveOne(0, 1, jewel);
				break;
			case ("E"):
				moveOne(1, 0, jewel);
				break;
			case ("S"):
				moveOne(0, -1, jewel);
				break;
			case ("W"):
				moveOne(-1, 0, jewel);
				break;
			}
		}
	}

	public int getPicked() {
		return picked;
	}
}

public class Main {

	public static void main(String[] args) throws Exception {
		while (doMain())
			;
		System.out.println("end");
		System.exit(0);
	}

	private static boolean doMain() throws Exception {
		Integer[] head = inpInt();
		if (head[0] == 0)
			return false;

		Jewel[] jewel = new Jewel[head[0]];
		for (int i = 0; i < head[0]; i++) {
			jewel[i] = new Jewel(inpInt());
		}
		Robt r = new Robt();
		r.locate(10, 10, jewel);

		Integer[] rob = inpInt();
		for (int i = 0; i < rob[0]; i++) {
			r.move(inp(), jewel);
		}

		if (head[0] == r.getPicked())
			System.out.println("Yes");
		else
			System.out.println("No");
		return (true);

	}

	// input from StdIn and get each element as Integer delimited by space
	private static Integer[] inpInt() throws IOException {
		String s = inp();
		String[] se;
		se = s.split(" ");

		Integer[] ie = new Integer[se.length];
		for (int i = 0; i < se.length; i++)
			ie[i] = Integer.valueOf(se[i]);
		return ie;
	}

	// input text line from StdIn
	private static String inp() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();

	}

}