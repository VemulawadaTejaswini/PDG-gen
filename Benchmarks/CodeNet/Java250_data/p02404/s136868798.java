import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;
		try {
			while ((buffer = reader.readLine())  != null) {
				Integer H = Integer.valueOf(buffer.substring(0, buffer.indexOf(" ") == -1 ? buffer.length() : buffer.indexOf(" ")));
				buffer = buffer.substring(buffer.indexOf(" ") + 1);
				Integer W = Integer.valueOf(buffer.substring(0, buffer.indexOf(" ") == -1 ? buffer.length() : buffer.indexOf(" ")));
				if (H == 0 && W == 0) {
					return;
				}
				for (int i = 0; i < H; i++) {
					if (i == 0 || i == H - 1) {
						for (int j = 0; j < W; j++) {
							System.out.print("#");
						}
					}
					else {
						for (int j = 0; j < W; j++) {
							if (j == 0 || j == W - 1) {
								System.out.print("#");
							}
							else {
								System.out.print(".");
							}
						}
					}
					System.out.println();
				}
				System.out.println();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}