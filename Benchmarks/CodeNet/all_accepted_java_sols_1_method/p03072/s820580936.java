import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i< N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		int ans = 0;
		for(int i = list.size() - 1; i >= 0; i--) {
			int tmp = list.get(i);
			boolean check = true;
			for(int j = i - 1; j >= 0; j--) {
				if(list.get(j) <= tmp) {
					continue;
				}else {
					check = false;
					break;
				}
			}
			if(check) ans++;
		}
		System.out.println(ans);
	}

}