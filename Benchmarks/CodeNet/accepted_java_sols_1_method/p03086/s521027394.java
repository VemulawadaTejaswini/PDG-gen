import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] strArray = sc.next().toCharArray();

		int max = 0;
		int i = 0;

		for (char c : strArray) {
			if (c == 'A' || c == 'G' || c == 'C' || c == 'T') {
				i++;
			} else {
				if (max < i)
					max = i;
				i = 0;
			}
		}
		if (max < i)
			max = i;
		System.out.println(max);
		sc.close();
	}
}
