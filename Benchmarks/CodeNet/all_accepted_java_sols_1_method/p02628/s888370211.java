import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		List<Integer> arr = new ArrayList();
		for(int i=0;i<N;i++) {
			arr.add(Integer.parseInt(sc.next()));
		}
		Collections.sort(arr);

		int totalMin =0;
		for(int i=0;i<K;i++) {
			totalMin+= arr.get(i);
		}

		System.out.println(totalMin);
	}
}
