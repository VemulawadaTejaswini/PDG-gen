import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int x = sc.nextInt();
        
        int sum = 0;
        int cnt = 0;
        
        while(true) {
            cnt++;
            sum += Math.max(h,w);
            if (sum >= x) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
