import java.util.*;
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong(),y=sc.nextLong();
        long ans = 0;
        for(long i = x;i<=y;i*=2)ans++;
        System.out.println(ans);
    }
}
