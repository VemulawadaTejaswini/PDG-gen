import java.util.*;
public class Main {
	public static void main(String[] args) {
		long H = new Scanner(System.in).nextLong(), ans = 1;
		for(int i = 0; i < (int) (Math.log(H) / Math.log(2)) + 1; i++)
			ans *= 2;
		System.out.println(ans-1);
	}
}
