import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			int[] lst = new int[3];
			for(int j = 0;j < 3; j++) {
				lst[j] = (int)Math.pow(s.nextInt(), 2);
			}
			Arrays.sort(lst);
			System.out.println(lst[0] + lst[1] == lst[2]?"YES":"NO");
		}
	}
}

