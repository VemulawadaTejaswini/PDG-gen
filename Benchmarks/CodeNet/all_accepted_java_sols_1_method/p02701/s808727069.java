import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
			int N = sc.nextInt();
			
			List<String> list = new ArrayList<String>();
			
			for(int i=0;i<N;i++) {
			list.add(sc.next());
			}
			
			List<String> ans = list.stream().distinct().collect(Collectors.toList());

			System.out.println(ans.size());
	}
}