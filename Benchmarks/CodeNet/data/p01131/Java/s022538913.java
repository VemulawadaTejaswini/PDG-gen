import java.util.Scanner;

public class icpc2006 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int test;
			test = scan.nextInt();
			String push;

			int onepush;
			String word;
			int samepushnumber;
			char preword = ' ';
			String[] result = new String[100];

			for (int i = 0; i < test; i++) {
				push = scan.next();

				samepushnumber = 0;
				word = "";

				for (int j = 0; j < push.length(); j++) {
					onepush = push.charAt(j) - '0';
					switch (onepush) {
					case 0:
						if (samepushnumber > 0)
							word += preword;
						samepushnumber = 0;

						break;
					case 1:
						samepushnumber++;
						if (samepushnumber % 5 == 1) {
							preword = '.';
						} else if (samepushnumber % 5 == 2) {
							preword = ',';
						} else if (samepushnumber % 5 == 3) {
							preword = '!';
						} else if (samepushnumber % 5 == 4) {
							preword = '?';
						} else if (samepushnumber % 5 == 0) {
							preword = ' ';
						}
						break;
					case 2:
						samepushnumber++;
						if (samepushnumber % 3 == 1) {
							preword = 'a';
						} else if (samepushnumber % 3 == 2) {
							preword = 'b';
						} else if (samepushnumber % 3 == 0) {
							preword = 'c';
						}
						break;
					case 3:
						samepushnumber++;
						if (samepushnumber % 3 == 1) {
							preword = 'd';
						} else if (samepushnumber % 3 == 2) {
							preword = 'e';
						} else if (samepushnumber % 3 == 0) {
							preword = 'f';
						}
						break;
					case 4:
						samepushnumber++;
						if (samepushnumber % 3 == 1) {
							preword = 'g';
						} else if (samepushnumber % 3 == 2) {
							preword = 'h';
						} else if (samepushnumber % 3 == 0) {
							preword = 'i';
						}
						break;
					case 5:
						samepushnumber++;
						if (samepushnumber % 3 == 1) {
							preword = 'j';
						} else if (samepushnumber % 3 == 2) {
							preword = 'k';
						} else if (samepushnumber % 3 == 0) {
							preword = 'l';
						}
						break;
					case 6:
						samepushnumber++;
						if (samepushnumber % 3 == 1) {
							preword = 'm';
						} else if (samepushnumber % 3 == 2) {
							preword = 'n';
						} else if (samepushnumber % 3 == 0) {
							preword = 'o';
						}
						break;
					case 7:
						samepushnumber++;
						if (samepushnumber % 4 == 1) {
							preword = 'p';
						} else if (samepushnumber % 4 == 2) {
							preword = 'q';
						} else if (samepushnumber % 4 == 3) {
							preword = 'r';
						} else if (samepushnumber % 4 == 0) {
							preword = 's';
						}

						break;
					case 8:
						samepushnumber++;
						if (samepushnumber % 3 == 1) {
							preword = 't';
						} else if (samepushnumber % 3 == 2) {
							preword = 'u';
						} else if (samepushnumber % 3 == 0) {
							preword = 'v';
						}

						break;
					case 9:
						samepushnumber++;
						if (samepushnumber % 4 == 1) {
							preword = 'w';
						} else if (samepushnumber % 4 == 2) {
							preword = 'x';
						} else if (samepushnumber % 4 == 3) {
							preword = 'y';
						} else if (samepushnumber % 4 == 0) {
							preword = 'z';
						}

						break;
					}
				}

				result[i] = word;

			}

			for (int i = 0; i < test; i++) {
				System.out.println(result[i]);
			}

		}
	}

}