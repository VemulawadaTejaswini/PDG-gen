
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		list.add(2);
		int tmp = 3;
		while(list.size() < k) {
			boolean flag = true;
			for(int i = 2; i < tmp; i++) {
				if(tmp % i == 0) {
					flag = false;
					break;
				}
			}
			if(flag && tmp % 5 == 1) {
				list.add(tmp);
			}
			tmp += 2;
		}
		list.forEach(e -> System.out.println(e));
	}

}
