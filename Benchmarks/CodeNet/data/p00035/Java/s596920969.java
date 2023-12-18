import java.util.*;
public class Main {

	boolean check(double[] coor) {
		return((coor[1] == coor[3] && coor[2] == coor[4] && coor[5] == coor[7] && coor[0] == coor[6]));
	}

	void doIt() {
		Scanner stdIn = new Scanner(System.in);

		while(stdIn.hasNext()) {
			double[] coor =new double[8];
			String input = stdIn.next();
			int index = 0;
			for(int r =0; r <32; r += 4) {
				double before = input.charAt(r) - '0';
				double after = (input.charAt(r + 2) - '0') / 10.0;
				coor[index++] = before + after;
			}
			System.out.println((check(coor) ? "YES" : "NO"));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}

}