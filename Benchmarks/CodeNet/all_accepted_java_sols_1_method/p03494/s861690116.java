import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		List<Integer> numList = new ArrayList();

		numList.add(Integer.parseInt(sc.next()));
		int count = 0;
		while(true) {
			count++;
			if(count == a) break;
			numList.add(Integer.parseInt(sc.next()));
		}
		int count2 = 0;
		LABEL1: while(true) {
			for(int i = 0; i <= numList.size() - 1; i++) {
				if(numList.get(i) % 2 == 0) {
					numList.set(i, numList.get(i)/2);
				} else {
					break LABEL1;
				}
			}
			count2++;
		}
		System.out.println(count2);


	}
}
