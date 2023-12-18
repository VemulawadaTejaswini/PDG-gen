import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		while (sc.hasNextLine()) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(String.valueOf(a+b).length());
		}
		sc.close();
	}
}