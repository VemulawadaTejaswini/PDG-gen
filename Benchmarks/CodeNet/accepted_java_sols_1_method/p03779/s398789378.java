import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int cnt = 0;
        int ans = 0;
        for(int i = 1; i<=x; i++) {
            cnt += i;
            if(cnt >= x) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);

    }
}