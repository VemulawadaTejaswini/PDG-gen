import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int d = reader.nextInt(), T = reader.nextInt(), s = reader.nextInt();
		if (s * T >= d) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		reader.close();
	}
	
}
