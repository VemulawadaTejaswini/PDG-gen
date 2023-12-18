import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, i, j, count = 0;
		String str, str1, dic[];
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		dic = new String[n];
		for (i = 0; i < n; ++i) {
			str = sc.next();
			if (str.equals("insert")) {
				dic[count] = sc.next();
				++count;
			}
			if (str.equals("find")) {
				str1 = sc.next();
				for (j = 0; j < count; ++j) {
					if (dic[j].equals(str1)) {
						System.out.println("yes");
						break;
					}
				}
				if (j == count) {
					System.out.println("no");
				}
			}
		}
		sc.close();
	}

}

