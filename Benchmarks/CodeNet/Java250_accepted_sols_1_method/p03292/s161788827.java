import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);

		Collections.sort(list);
		System.out.println(list.get(2)-list.get(0));
		int result =0;
		// スペース区切りの整数の入力







	}
}