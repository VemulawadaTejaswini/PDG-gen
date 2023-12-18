import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			String tmp = s.nextLine();
			int m = Integer.parseInt(tmp);
			if(m == 0)
				break;
			solve(m, m, "");
		}
	}

	public static void solve(int squareCnt, int maxPutCnt, String history) {
		if(squareCnt == 0) {
			System.out.println(history.trim());
			return;
		}

		for(int i = maxPutCnt ; i >= 1 ; i--) {
			if(i <= squareCnt)
			solve(squareCnt-i, i, history + " " + i+" ");
		}
	}
}