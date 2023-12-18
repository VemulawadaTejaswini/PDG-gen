import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		Collections.sort(list);

		int count = 1;
		for(int i = 1; i < list.size(); i++) {
			int tmp = list.get(i);
			int j = 0;
			boolean check = true;
			while(check) {
				int divide = list.get(j);
				if(tmp % divide == 0) {
					check = false;
				}else if(j == i - 1) {
					count++;
					check = false;
				}
				j++;
			}
		}
		if(list.get(0) == list.get(1)) {
			count--;
			System.out.println(count);
		}else {
			System.out.println(count);
		}
		
	}

}