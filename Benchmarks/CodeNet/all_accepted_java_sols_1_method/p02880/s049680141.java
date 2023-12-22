import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		sc.close();

		List<Integer> list = new ArrayList<Integer>();
		int num = 0;
		int count = 0;
		for (int i = 1; i <= 9 ; i++ ) {
			for (int j = 1; j <= 9 ; j++ ) {
				num = i*j;
				list.add(num);
			}
		}

		for (int k=0; k < list.size(); k++) {
			if (input1 == list.get(k)) {
				System.out.println("Yes");
				count ++;
				break;
			}
		}
		if(count == 0) {
			System.out.println("No");
		}
	}

}