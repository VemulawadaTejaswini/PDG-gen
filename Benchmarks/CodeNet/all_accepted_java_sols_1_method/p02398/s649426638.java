import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] info = line.split(" ");
		int a = Integer.parseInt(info[0]);
		int b = Integer.parseInt(info[1]);
		int c = Integer.parseInt(info[2]);
		int count = 0;
		for (int i = a; i < b + 1; i++) {
			if (c % i == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}