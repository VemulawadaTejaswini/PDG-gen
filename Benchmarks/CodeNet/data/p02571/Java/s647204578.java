import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try (Scanner sc = new Scanner(System.in)) {
				String s = sc.nextLine();
				String t = sc.nextLine();

				int len = t.length();

				int ans = 0;

					
				for (int i = 0; i < (len - 1); i++) {
					ans = 0;
					for (int j = len; j > 0; j--) {
						String subT = t.substring(i, j);

						if (s.contains(subT)) {
							System.out.println(String.valueOf(ans));
							return;
						}
						ans++;

					}
				}
					

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}