import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = sc.nextInt();
		int deSum = 0;
		
		for(int i = 0; i < 9; i++) {
			deSum+=sc.nextInt();
		}
		
		System.out.println(sum - deSum);
	}
}