import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		// スペース区切りの整数の入力
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<N;i++){
			list.add(sc.nextInt());
		}
		Optional<Integer> max = list.stream().max(Comparator.naturalOrder());
		Optional<Integer> min = list.stream().min(Comparator.naturalOrder());
		
		// 出力
		System.out.println(max.get()-min.get());
	}
}