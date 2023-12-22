import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		for(int i = 1;i <= count;i++ ) {
			int num = 0;
			if(i % 3 == 0) {
				num = i;
			} else if(i % 10 == 3) {
				num = i;
			} else if((i / 10) %  10 == 3 || (i / 100) %  10 == 3 || (i / 1000) %  10 == 3) {
				num = i;
			}

			if(num != 0) {
				System.out.print(" " + num);
			}

		}
		System.out.println();
		sc.close();

	}
}