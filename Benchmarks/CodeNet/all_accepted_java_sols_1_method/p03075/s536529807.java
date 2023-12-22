import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int limit = 5;
		int [] list = new int [limit];

		for(int i = 0 ; i < limit ; ++i) {

			list[i] = Integer.parseInt(sc.next());

		};

		int k = Integer.parseInt(sc.next());

		if(list[list.length-1] - list[0] <= k) {
			System.out.println("Yay!");
		}else {
			System.out.println(":(");

		}

	}

}
