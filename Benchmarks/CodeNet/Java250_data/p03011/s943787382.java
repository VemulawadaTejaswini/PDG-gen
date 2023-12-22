import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < 3; i++) {
		list.add(Integer.parseInt(sc.next()));
		}
		list.sort(null);
		int ans = list.get(0) + list.get(1);
		System.out.print(ans);
	}

}
