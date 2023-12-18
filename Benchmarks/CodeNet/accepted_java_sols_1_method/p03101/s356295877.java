import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int W = in.nextInt();
		int h = in.nextInt();
		int w = in.nextInt();
		in.close();

		int result = H * W - H * w - h * W + h * w;
		System.out.println(result);
	}

}
