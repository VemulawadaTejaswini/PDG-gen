import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int P = sc.nextInt();
		int Q = sc.nextInt();
		int R = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();
		list.add(P + Q);
		list.add(P + R);
		list.add(Q + R);

		Integer i = Collections.min(list);
		System.out.println(i);
	}
}
