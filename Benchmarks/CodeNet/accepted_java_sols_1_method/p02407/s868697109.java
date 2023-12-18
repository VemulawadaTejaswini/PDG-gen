import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayDeque<Integer> list = new ArrayDeque<Integer>();
		int n = scan.nextInt();
		int num;

		for(int i = 0 ; i < n ; i++) {
			if(scan.hasNext()) {
				num = scan.nextInt();
				list.add(num);
			}
		}
		scan.close();

		for(int j = 0 ; j < n ; j++) {
			if(j == n - 1) {
				System.out.println(list.pollLast());
			}else {
				System.out.print(list.pollLast() + " ");
			}
		}
	}
}

