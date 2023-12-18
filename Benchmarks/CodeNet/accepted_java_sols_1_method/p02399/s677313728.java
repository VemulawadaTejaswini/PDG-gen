import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.printf("%d %d %.5f",(a/b),(a%b), a/(b*1.0) );
		
		scanner.close();
	}

}