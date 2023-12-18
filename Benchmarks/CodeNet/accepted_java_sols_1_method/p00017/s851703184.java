import java.util.Scanner;

public class Main {
    static final String KEY1 = "this";
    static final String KEY2 = "that";
    static final String KEY3 = "the";

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {

			String inputData = sc.nextLine();

			int count = 1;

			for (int i = 0; i < 27; i++) {
				StringBuilder sb = new StringBuilder();

				for (int j = 0; j < inputData.length(); j++) {
					char c = inputData.charAt(j);

					if ((int) c <= 127 && (int) c >= 92) {
						c = (char) ((int) c + count);

						if (c > 122) {
							c = (char) ((c - 122) + 96);
						} else if (c < 97) {
							c = (char) (123 - (97 - c));
						}
					}
					sb.append(c);
				}
				String aaa = sb.toString();

				if (aaa.matches(".*" + KEY1 + ".*")
						|| aaa.matches(".*" + KEY2 + ".*")
						|| aaa.matches(".*" + KEY3 + ".*")) {
					System.out.println(sb);
					
					break;
				}
				count++;
			}

		}
	}

}