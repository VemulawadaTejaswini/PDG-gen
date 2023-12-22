import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int l = Integer.parseInt(sc.next());
		List<String> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(sc.next());
		}
		String ans = list.stream().sorted().collect(Collectors.joining());
		System.out.println(ans);

	}

}
