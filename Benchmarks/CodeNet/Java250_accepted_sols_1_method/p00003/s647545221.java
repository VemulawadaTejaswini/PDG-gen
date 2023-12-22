import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dataset = Integer.parseInt(br.readLine());
		String str;

		for(int i = 0; i < dataset; i++) {
			str = br.readLine();
			String strline[] = str.split(" ", 0);

			int line[] = new int[strline.length];
			for(int j = 0; j < 3; j++) {
				line[j] = Integer.parseInt(strline[j]);
			}
			Arrays.sort(line);

			if(Math.pow((double)line[2], 2) == Math.pow((double)line[0], 2) + Math.pow((double)line[1], 2)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}