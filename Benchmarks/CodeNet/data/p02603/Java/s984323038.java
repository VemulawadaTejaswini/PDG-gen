import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		int maxValue = Integer.MIN_VALUE;
		for(int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(sc.next());
			list.add(tmp);
			maxValue = Math.max(maxValue, tmp);
		}
		sc.close();

		int value = 1000;
		int bill = 0;
		if(list.get(0) != maxValue) {
			bill = value / list.get(0);
			value = value % list.get(0);
		}else {
			System.out.println(1000);
			return;
		}

		for(int i = 1; i < list.size(); i++) {
			int tmpValue = list.get(i);
			int checkValue = list.get(i - 1);

			if(checkValue < tmpValue) {
				if(bill > 0) {
					value += tmpValue * bill;
					bill = 0;
				}else {
					continue;
				}
			}else if(checkValue > tmpValue){
				if(value > 0) {
					bill = value / list.get(i);
					value = value % list.get(i);
				}else {
					continue;
				}
			}
		}
		System.out.println(value);
	}
}