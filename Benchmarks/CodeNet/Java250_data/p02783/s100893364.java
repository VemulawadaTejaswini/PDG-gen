import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int cnt = 0;
        while(true) {
            cnt++;
            n -= a;
            if (n <= 0) {
                break;
            }
        }
        
        System.out.println(cnt);
    }
}
