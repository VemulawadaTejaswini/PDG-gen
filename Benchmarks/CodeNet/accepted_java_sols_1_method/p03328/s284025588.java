import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int height = b-a;
        int ans = 0;
        for(int i = 1; i<=height; i++) {
            ans += i;
        }
        ans -= b;
        System.out.println(ans);
    }
}