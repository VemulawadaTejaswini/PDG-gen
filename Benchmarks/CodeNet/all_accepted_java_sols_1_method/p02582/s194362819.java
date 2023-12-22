import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		int count = 0;
		int res = 0;
		for (int i = 0; i < 3; i++) {
			char data = (char) System.in.read();
			if (data == 'R') {
				count++;
			}
			if (data == 'S') {
				count = 0;
			}
			if (count > res) {
				res = count;
			}
		}
		System.out.println(res);
	}

}
