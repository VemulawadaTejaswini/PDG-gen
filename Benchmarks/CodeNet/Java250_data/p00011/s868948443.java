import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int w = Integer.parseInt(sc.nextLine());
	static int[] res = new int[w];
	static int n = Integer.parseInt(sc.nextLine());
	static ArrayList<HorizLine> hL = new ArrayList<HorizLine>();

	public static void main(String[] args) {
		setHorizLine();
		drawLot();
	}

	private static void drawLot() {
		for (int i = 1; i <= w; i++) {
			int p = i;
			for (int j = 0; j < n; j++) {
					if (p == hL.get(j).getPointL() ) {
						p = hL.get(j).getPointR();
					} else if (p == hL.get(j).getPointR()) {
						p = hL.get(j).getPointL();
					}
			}

			res[p - 1] = i;
		}

		for (int i = 0; i < w; i++) {
			System.out.println(res[i]);
		}

	}

	private static void setHorizLine() {
		for (int i = 0; i < n; i++) {
			String[] pt = sc.nextLine().split(",");
			hL.add(new HorizLine( Integer.parseInt(pt[0]), Integer.parseInt(pt[1]) ));
		}

	}



}

 class HorizLine {
	private int pointL;
	private int pointR;

	HorizLine(int pointL, int pointR) {
		this.pointL = pointL;
		this.pointR = pointR;
	}

	public int getPointL() {
		return pointL;
	}
	public int getPointR() {
		return pointR;
	}
	public void setPointL(int pointL) {
		this.pointL = pointL;
	}
	public void setPointR(int pointR) {
		this.pointR = pointR;
	}


}
