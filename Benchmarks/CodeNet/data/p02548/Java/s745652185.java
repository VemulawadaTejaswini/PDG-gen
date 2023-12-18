import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                long tmp1 = i * j;
                if(tmp1 >= n) {
                    break;
                }else if(tmp1 < n) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}