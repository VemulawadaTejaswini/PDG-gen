import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> price = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			price.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		//降順にソート
		Collections.sort(price, Collections.reverseOrder());
		int money = 0;
		for(int i = 0; i < price.size(); i++) {
			if(i == 0) {
				money += price.get(i) / 2;
			}else {
				money += price.get(i);
			}
		}
		System.out.println(money);
	}

}
