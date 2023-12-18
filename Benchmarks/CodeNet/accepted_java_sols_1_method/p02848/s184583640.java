import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();

		char[] list = s.toCharArray();

		for(int i = 0; i < list.length; i++) {
			list[i] += n;

			while(list[i] > 'Z') {
				list[i] -= 26;
			}

		}

		System.out.println(list);

		sc.close();
	}

}
