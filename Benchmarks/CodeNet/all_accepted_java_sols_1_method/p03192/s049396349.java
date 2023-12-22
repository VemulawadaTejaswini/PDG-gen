import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		char[] c = s.toCharArray();

		int count = 0;
		for (int i = 0; i < c.length; i++) {

			if(c[i] == '2') {
				count++;
			}

		}

		System.out.println(count);

		sc.close();
	}

}
