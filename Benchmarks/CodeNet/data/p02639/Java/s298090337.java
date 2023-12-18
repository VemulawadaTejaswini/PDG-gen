import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		for(int i = 0; i < 5; i++) {
			if(list.get(i) == 0) {
				int ans = i + 1;
				System.out.println(ans);
				return;
			}
		}
	}

}