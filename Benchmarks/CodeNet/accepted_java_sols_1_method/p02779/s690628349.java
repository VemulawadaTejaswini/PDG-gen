import java.util.HashSet;
import java.util.Scanner;

class Main {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		boolean flag = true;
		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < N; i++) {
			int n = scanner.nextInt();
			if (set.contains(n)) {
				flag = false;
				break;
			}
			set.add(n);
		}
		
		scanner.close();

		if (flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}	
	}
}