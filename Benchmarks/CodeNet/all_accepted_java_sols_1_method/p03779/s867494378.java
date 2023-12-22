import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int x=scanner.nextInt();
		int ans = 0;
		int count = 0;
		for(;ans < x;count++){
			ans += count;
		}
		System.out.println(count-1);
	}
}