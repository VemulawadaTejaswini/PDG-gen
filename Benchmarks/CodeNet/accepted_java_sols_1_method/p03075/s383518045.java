import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int min = 123;
		int x;
		for (int i=0; i<5;i++) {
			x = sc.nextInt();
			max  =Math.max(max,x);
			min = Math.min(min,x);
		}
		int k = sc.nextInt();
		if (max - min > k)
			System.out.println(":(");
		else
			System.out.println("Yay!");
	}
}
