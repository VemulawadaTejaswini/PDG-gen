import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        for (int x = 1; x <= N-1; x++) {
            for (int a = 1; a*a <= x; a++) {
                if (x%a == 0) {
                    if (x/a == a) {
                        ans++;
                    } else {
                        ans+=2;
                    }
                } 
            }
        }
        System.out.println(ans);
    }
}
