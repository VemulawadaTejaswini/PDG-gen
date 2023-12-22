import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long action = sc.nextLong() + 1;
		long sell = sc.nextLong();
		long buy = sc.nextLong();
		long cookie = 0;
		for(int i = 0; i < action; i ++) {
			if(i < action - 1 && cookie >= sell && (sell + 2) < buy) {
				cookie += buy - sell;
				i ++;
			}else {
				cookie ++;
			}
		}
		System.out.println(cookie);
	}
}