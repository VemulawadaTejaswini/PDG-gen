import java.util.Scanner;
// import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] scan = scanner.nextLine().split(" ");
		scanner.close();
		int a = Integer.parseInt(scan[0]);
		int b = Integer.parseInt(scan[1]);

		int count = 0;
		if(a <= b) count++;
		count += a - 1;
		System.out.println(count);
	}
}
