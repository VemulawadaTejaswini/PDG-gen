import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner seer = new Scanner(System.in);
		int a = seer.nextInt();
		int b = seer.nextInt();
		int c = seer.nextInt();
		System.out.println(Integer.min(Integer.min(a+b, b+c), c+a));
	}

}
