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

		int count = 0;
		for(int i = 0; i < N; i++) {
			int tmp = i + 1;
			int tmpNum = list.get(i);
			if(tmp % 2 == 1) {
				if(tmpNum % 2 == 1) {
					count++;
				}else {
					continue;
				}
			}else {
				continue;
			}
		}
		System.out.println(count);
	}

}