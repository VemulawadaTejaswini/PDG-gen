import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCard = sc.nextInt();
		int numGate = sc.nextInt();
		int count[] = new int[numCard + 10];
		for(int i = 0; i < numCard; i ++) {
			count[i] = 0;
		}
		for(int i = 0; i < numGate; i ++) {
			count[sc.nextInt() - 1] ++;
			count[sc.nextInt()] --;
		}
		for(int i = 1; i < numCard; i ++) {
			count[i] += count[i - 1];
		}
		int ans = 0;
		for(int i = 0; i < numCard; i ++) {
			ans += count[i] == numGate ? 1 : 0;
		}
		System.out.println(ans);
	}
}