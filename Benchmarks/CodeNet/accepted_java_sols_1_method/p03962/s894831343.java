import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
        Set<Integer> list = new HashSet<>();
        Collections.addAll(list, a, b, c);
    
		// 出力
		System.out.println(list.size());
	}
}