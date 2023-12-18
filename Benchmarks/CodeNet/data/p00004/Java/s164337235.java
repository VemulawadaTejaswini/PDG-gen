import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int[] in = new int[6];
			for (int i = 0; i < in.length; i++) {
				in[i] = scanner.nextInt();
			}
			int det = in[0] * in[4] - in[1] * in[3];
			int[] rev = new int[4];
			rev[0] = in[4];
			rev[1] = -in[1];
			rev[2] = -in[3];
			rev[3] = in[0];
			float x = (rev[0] * in[2] + rev[1] * in[5]) / det;
			float y = (rev[2] * in[2] + rev[3] * in[5]) / det;
			System.out.println(String.format("%.3f %.3f\n", x, y));
		}
	}

}

