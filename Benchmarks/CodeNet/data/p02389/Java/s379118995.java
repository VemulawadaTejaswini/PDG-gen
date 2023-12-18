import java.util.Scanner;

class XCubic {
	private static final int STOP_CNT = 3;
	private int _x;
	public XCubic(int x) {
		_x = x;
	}
	public int calc(int cnt) {
		if (STOP_CNT <= cnt)
			return _x;
		
		return _x * calc(cnt + 1);
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		XCubic xCubic = new XCubic(Integer.parseInt(scan.next()));
		System.out.println(xCubic.calc(1));
	}

}

