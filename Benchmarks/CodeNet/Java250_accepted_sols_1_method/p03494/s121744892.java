import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
		// スペース区切りの整数の入力
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            int x = 0;
            while (d % 2 == 0) {
                d /= 2;
                x++;
            }
            list.add(x);
        }
        Collections.sort(list);
		// 出力
		System.out.println(list.get(0));
	}
}
