import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		//??????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;

		while ((str = br.readLine()) != null){
			int num = 0;
			int input = Integer.parseInt(str);
			for (int i = 0; i <= 9; i++) {
				for (int j = 0; j <=9; j++) {
					for (int k = 0; k <= 9; k++) {
						for (int l = 0; l <= 9; l++) {
							if (i + j + k + l == input) {
								num++;
							}
						}
					}
				}
			}
			System.out.println(num);
		}
	}
}