import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int[] lst = new int[10];
		for (int i = 0; i < 10; i++) {
			lst[i] = a.nextInt();
		}
		Arrays.sort(lst);
		for (int i = 9; i > 6; i--) {
			System.out.println(lst[i]);
		}
	}
}
