import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] town = new int[4];
		
		for (int i = 0; i < 6; i++) {
			int hoge = sc.nextInt() - 1;
            town[hoge]++;
		}
		
		boolean isAns = true;
		for (int i : town) {
			if (i > 2)
				isAns = false;
		}
		
		System.out.println(isAns ? "YES" : "NO");
	}
}