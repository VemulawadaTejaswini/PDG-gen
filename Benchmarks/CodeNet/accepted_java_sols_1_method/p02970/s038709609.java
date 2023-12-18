import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int cnt=0;
        int now = 0;
        while(now<n) {
            now += 2*d+1;
            cnt++;
        }

        System.out.println(cnt);
    }
}