import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		int x = Integer.parseInt(sb.append(a).append(b).toString());
		boolean flag = false;
		for (int i = 1; i * i <= x; i++ ) {
			if (i * i == x) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
