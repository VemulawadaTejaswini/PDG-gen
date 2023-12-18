import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		List<Integer> list = new ArrayList<>();

		int a = sc.nextInt();
		int b = sc.nextInt();
		int bigger = Math.max(a,b);
		int lesser = Math.min(a,b);

		if(bigger>lesser){
			System.out.println(bigger*2-1);
		} else if(bigger ==lesser){
			System.out.println(bigger+lesser);
		}
	}
}
