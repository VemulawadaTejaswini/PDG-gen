import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long ln[] = {Math.max(sc.nextLong() - 1, 0), sc.nextLong()};
		long fn[] = new long[2];
		for(int i = 0; i < 2; i ++) {
			if(ln[i] % 2 == 0) {
				fn[i] = ln[i] ^ (ln[i] % 4 == 0 ? 0 : 1);
			}else {
				fn[i] = ln[i] % 4 == 3 ? 0 : 1;
			}
		}
		System.out.println(fn[0] ^ fn[1]);
	}
}