import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			int i;
			int total;

			int arrayInt[] = new int[1001];

			while(true) {

				total = 0;
				int x = sc.nextInt();

				if(x == 0) {
					break;
				}

				String[] str = String.valueOf(x).split("");

				for(i = 0; i < str.length; i++) {
					arrayInt[i] = Integer.parseInt(str[i]);
				}

				for(i = 0; i < str.length; i++) {
					total += arrayInt[i];
				}

				System.out.println(total);
			}

	}
}