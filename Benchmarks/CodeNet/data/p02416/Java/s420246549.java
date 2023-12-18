import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while (true) {
			int num = stdIn.nextInt();
			int ans = 0;
			if(num == 0)
				break;
			while(num != 0){
				ans += num%10;
				num /= 10;
			}
			System.out.println(ans);
		}
	}
}