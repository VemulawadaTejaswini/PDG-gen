import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.next());
		ArrayList<Long> list = new ArrayList<Long>(N);
		long comfort = 0;
		long right = 0;
		long left = 0;
		for(int i=0;i<N;i++) {
			list.add(Long.parseLong(scanner.next()));
		}
		Collections.sort(list);
		Collections.reverse(list);
		right = list.get(0);
		left = list.get(1);
		comfort += right;
		for(int i=2;i<N;i++) {
			if(right > left) {
				comfort += left;
				left = list.get(i);
			}else {
				comfort += right;
				right = list.get(i);
			}
		}
		System.out.println(comfort);
		scanner.close();
	}
}