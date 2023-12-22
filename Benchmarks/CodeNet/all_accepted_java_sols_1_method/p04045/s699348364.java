import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		List<Integer> hates = new ArrayList<>();
		boolean judge =true;

		for(int i=0; i<k;i++) {
			hates.add(scanner.nextInt());
		}

		while (judge) {
			List<Integer> list = new ArrayList<>();
			for (int i = n; i != 0; i /= 10) {
				int target = i % 10;
				list.add(target);
			}
			for(int hate:hates) {
				if(!(list.contains(hate))) {
					judge=false;
				}else {
					judge = true;
					break;
				}
			}
			n++;
		}

		System.out.println(n-1);
	}
}