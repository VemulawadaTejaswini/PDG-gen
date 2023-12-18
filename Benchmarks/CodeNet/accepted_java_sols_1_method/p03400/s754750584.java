import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt() - 1;
        int x = sc.nextInt();
        int ans = n;
        for(int i = 0;i < n;i++){
            int day = sc.nextInt();
            ans += d / day;
        }
        System.out.println(ans + x);
    }
}