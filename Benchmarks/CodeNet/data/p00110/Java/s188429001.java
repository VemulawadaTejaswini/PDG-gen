import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		boolean flag;

		while (sc.hasNext()) {
			flag = true;
			String s = sc.nextLine();
			for (int i = 0; i < 10; i++) {
				String s2 = s;
				s2 = s2.replace('X', (char)(i + '0'));
				String s3[] = s2.split("\\+");
				a = Integer.valueOf(s3[0]);
				s3 = s3[1].split("\\=");
				b = Integer.valueOf(s3[0]);
				c = Integer.valueOf(s3[1]);
				if (a + b == c) {
					System.out.println(i);
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("NA");
			}
		}
	}
}