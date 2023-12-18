import java.util.*;
public class Main {

	public static void main(String[] args) {
		int i1, i2;
		Scanner sc = new Scanner(System.in);
		i1 = sc.nextInt();
		i2 = sc.nextInt();
		System.out.printf("%d %d %.5f\n", (i1 / i2), (i1 % i2), ((float)i1 / (float)i2));
	}
}