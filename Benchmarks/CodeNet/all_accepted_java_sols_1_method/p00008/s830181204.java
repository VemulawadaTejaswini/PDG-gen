import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		try {
			while (input.ready()) {
				int num = Integer.valueOf(input.readLine());
				int ans = 0;
				for (int i = 0; i < 10; i++) {
					if(i > num) break;
					for (int j = 0; j < 10; j++) {
						if(j > num) break;
						for (int k = 0; k < 10; k++) {
							if(k > num) break;
							for (int l = 0; l < 10; l++) {
								if(l > num) break;
								if (i + j + k + l == num) {
									ans += 1;
								}
							}
						}
					}
				}
				System.out.println(ans);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}