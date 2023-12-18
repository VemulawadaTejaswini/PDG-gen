import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int total = 0, ans = 0;
		for(int i = 1; i <= X; i++) {
			ans++;
			total += i;
			if(total >= X)
				break;
		}
		System.out.println(ans);

	}

}