import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] x = new boolean[3];
        int A = sc.nextInt();
        int B = sc.nextInt();
        x[A-1] = true;
        x[B-1] = true;
        int ans = 0;
        for (int i = 0; i < 3; i++) {
            if (!x[i]) {
                ans = i+1;
                break;
            }
        }

        System.out.println(ans);
    }
}
