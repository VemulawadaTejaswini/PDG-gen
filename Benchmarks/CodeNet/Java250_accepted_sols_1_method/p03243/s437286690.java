import java.util.*;

public class Main {
	public static void main(String[] args) {
		Integer list[] = { 111, 222, 333, 444, 555, 666, 777, 888, 999 };

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ret = 0;
		for (int i = n; true; i++) {
			if (Arrays.asList(list).contains(i)) {
				ret = i;
				break;
			}
		}

		System.out.println(ret);

		sc.close();
	}
}