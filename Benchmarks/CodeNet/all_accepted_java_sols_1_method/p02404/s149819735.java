
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		String[] arrStr;
		StringBuilder sb = new StringBuilder();
		try {


			while (true) {
				str = br.readLine();
				arrStr = str.split(" ");

				int h = Integer.parseInt(arrStr[0]);
				int w = Integer.parseInt(arrStr[1]);
				if (h == 0 && w == 0) {
					break;
				}
				for (int i = 0; i < h; i++) {
					for (int j = 0; j < w; j++) {
						if (   (i == 0 || j == 0)
							|| ((i == h - 1) || j == w - 1)) {
							sb.append("#");
						}else{
							sb.append(".");
						}
					}
					sb.append("\n");
				}
				System.out.println(sb.toString());
				sb.setLength(0);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}