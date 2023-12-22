import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt(), X = reader.nextInt(), T = reader.nextInt();
		System.out.println((int) Math.ceil(((double) N) / X) * T);
		reader.close();
	}
	
}
