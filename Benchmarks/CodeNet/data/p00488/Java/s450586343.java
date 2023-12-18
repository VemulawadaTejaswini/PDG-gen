import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int i, p, j, set, pmin = 0, jmin = 0;
		for(i = 0; i < 3; i++) {
			p = sc.nextInt();
			if(i == 0 || pmin > p) pmin = p;
		}
		for(i = 0; i < 2; i ++) {
			j = sc.nextInt();
			if(i == 0 || jmin > j) jmin = j;
		}
		set = pmin + jmin - 50;
		System.out.println(set);
	}
}