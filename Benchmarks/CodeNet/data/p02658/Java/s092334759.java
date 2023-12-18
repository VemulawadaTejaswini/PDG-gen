import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long N = scn.nextLong();
		long ans = 1;
		for(long i = 0 ; i < N ; i++) {
			ans *= scn.nextLong();
		}
		scn.close();
		if(ans >= Math.pow(10, 18)) {
			System.out.println(-1);
		}else {
			System.out.println(ans);
		}
	}

}
