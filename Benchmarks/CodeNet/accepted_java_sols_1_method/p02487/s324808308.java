import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a = 0, b = 0;
		Scanner in = new Scanner(System.in);
		StringBuilder buffer = new StringBuilder();
		for (;;) {
			try {
				a = in.nextInt();
				b = in.nextInt();
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
			if (a == 0 && b == 0)
				break;
			
			for (int i = 0; i < a; ++i) {
				for (int j = 0; j < b; ++j) {
					if (i == 0 || i == a - 1 || j == 0 || j == b - 1)
						buffer.append("#");
					else
						buffer.append(".");
				}
				buffer.append("\n");
			}
			System.out.println(buffer);
			buffer.delete(0, buffer.length());
		}
		in.close();
	}
}