import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		
		int ans = x/(y+z);
		
		if (x%(y+z)<z) {
			ans--;
		}
		System.out.println(ans);
		
		scanner.close();
	}

}