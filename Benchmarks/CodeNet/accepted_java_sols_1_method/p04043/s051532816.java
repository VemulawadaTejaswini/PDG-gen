import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(Integer.parseInt(sc.next()));
		arrayList.add(Integer.parseInt(sc.next()));
		arrayList.add(Integer.parseInt(sc.next()));

		long count_5 = arrayList.stream().filter(c -> c == 5).count();
		long count_7 = arrayList.stream().filter(c -> c == 7).count();

		if(count_5 == 2 && count_7 == 1){
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
