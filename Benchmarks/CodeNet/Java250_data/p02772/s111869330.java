import java.util.ArrayList;
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

		boolean check = true;

		//条件分岐
		for(int i = 0; i < list.size(); i++) {
			int number = list.get(i);
			if(number % 2 != 0) {
				continue;
			}else if(number % 6 == 0 || number % 10 == 0) {
				continue;
			}else {
				System.out.println("DENIED");
				check = false;
				return;
			}

		}
		if(check) System.out.println("APPROVED");

	}
}
