import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n < 2) {
			System.out.println("0");
			System.exit(0);
		}
		long ans = n;
		for(int i = 0; i <n - 2; i++) {
			ans = (ans + n) % 1000000007L;
		} // ans * (ans - 1)/ 2 nC2(0 9を選ぶ)
		ans /= 2;
		System.out.println(ans + "A");
		long beforeAns = ans;
		for(int i = 0; i < 3; i++) {
			ans = (ans + beforeAns) % 1000000007L;
		} //ans *= 4(0 9の並びは4通り)
		System.out.println(ans + "B");

		long count = 0;
		long beforeAns2 = ans;
		for(int i = 0; i < (n - 2) * 10 - 1; i++) {
			ans = (ans + beforeAns2) % 1000000007L;
			count++;
		}
		System.out.println(count);
		System.out.println(ans % 1000000007L - 2);
    }
}