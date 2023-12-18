import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int size = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();

		if(size == 0) {
			System.out.println(target);
			sc.close();
			return;
		}

		for (int i=0;i < size;i++) {
			list.add(sc.nextInt());
		}
		sc.close();

		Collections.sort(list);
		int tmp = list.indexOf(target);

		if(tmp < 0) {
			System.out.println(target);
			return;
		}

		int count = 1;
		while(tmp - count >= 0 || tmp + count <= size) {
			if(tmp - count >= 0 && list.indexOf(target - count) < 0) {
				System.out.println(target - count);
				return;
			}
			if(tmp + count <= size && list.indexOf(target + count) < 0) {
				System.out.println(target + count);
				return;
			}

			count++;
		}
		System.out.println(0);
		return;
	}

}