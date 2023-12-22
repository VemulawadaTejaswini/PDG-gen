import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        int cnt = 0;
        if (n >= 2) {
            cnt += n * (n-1) / 2;
        }
        if (m >= 2) {
            cnt += m * (m-1) / 2;
        }
        
        System.out.println(cnt);
    }
}