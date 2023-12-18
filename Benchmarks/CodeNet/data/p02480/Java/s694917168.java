import java.util.*;
class Main {

	public static void main(String[] args) {
		int input;
		Scanner sc = new Scanner(System.in);
		int ans = 1;
		input = sc.nextInt();
		for(int i = 0; i < 3; i++) {
			ans *= input;
		}
		System.out.println(ans);
	}

}