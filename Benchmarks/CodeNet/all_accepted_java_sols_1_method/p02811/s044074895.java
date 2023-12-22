import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(), x = sc.nextInt();
		String ans[] = {"Yes", "No"};
		int an = 0;
		sc.close();
		int tmp = 500 * k;
		if(tmp < x)an = 1;
		System.out.println(ans[an]);
	}
}
