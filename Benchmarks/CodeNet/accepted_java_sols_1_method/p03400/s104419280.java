import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			int v = sc.nextInt();
			int j = 0;
			while (v * j < d) {
				count++;
				j++;
			}
		}
		System.out.println(count + x);
	}
}
