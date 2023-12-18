import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
 
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
 
        int cnt = 0;
        boolean next = true;
        while (next) {
            for (int i = 0; i < N; i++) {
                if (a[i] % 2 != 0) {
                    next = false;
                    break;
                } else {
                    a[i] = a[i] / 2;
                }
            }
            if (next) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}