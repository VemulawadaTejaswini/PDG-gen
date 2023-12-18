import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> arr = new ArrayList<>();

		for(int i = 0; i < 5; i++) {
			arr.add(sc.nextInt());
		}

		for(int i = 1; i <= 5; i++) {
			if(arr.get(i-1) == 0) {
				System.out.println(i);
				break;
			}
		}
	}

}
