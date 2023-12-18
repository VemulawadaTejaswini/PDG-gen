import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		List<Integer> list = new ArrayList<>();

		int a = sc.nextInt();
		int p = sc.nextInt();
		int kakera = a * 3 + p;
		int pie = kakera / 2;
		System.out.println(pie);

	}
}
