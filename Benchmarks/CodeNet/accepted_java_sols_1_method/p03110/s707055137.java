import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<Double> list = new ArrayList<>();
		ArrayList<String> checkList = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(Double.parseDouble(sc.next()));
			checkList.add(sc.next());
		}
		sc.close();

		double money = 0;
		for(int i = 0; i < N; i++) {
			if(checkList.get(i).equals("JPY")) {
				money += list.get(i);
			}else {
				money += list.get(i) * 380000.0;
			}
		}
		System.out.println(String.format("%13.4f", money));
	}

}