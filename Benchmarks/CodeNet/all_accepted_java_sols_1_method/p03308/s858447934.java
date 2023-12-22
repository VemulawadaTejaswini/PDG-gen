import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		// スペース区切りの整数の入力
		for(int i=1;i<=a;i++){
			list.add(sc.nextInt());
		}

		Optional<Integer> min = list.stream()
		.min((c, b) -> c.compareTo(b));
		Optional<Integer> max = list.stream()
		.max((c, b) -> c.compareTo(b));

		System.out.println(max.get()-min.get());
	}
}