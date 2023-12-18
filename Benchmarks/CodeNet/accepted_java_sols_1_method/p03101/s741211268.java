import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int H = scanner.nextInt();
		int W = scanner.nextInt();
		int h = scanner.nextInt();
		int w = scanner.nextInt();
		
		System.out.println((H-h) * (W-w) );
		scanner.close();
	}

}
