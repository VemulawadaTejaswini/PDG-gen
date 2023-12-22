import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = sc.nextInt();
        long ans = 0;
        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            if (a <= max) {
                ans += max - a;
            } else {
                max = a;
            }
        }
        System.out.println(ans);
	}
}