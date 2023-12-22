
import java.util.*;

/**
 * Created by Seiya on 2016/10/16.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[100002];
        for (int i = 0; i < 100002; i++) {
            a[i] = 0;
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int temp = scanner.nextInt();
            if(a[temp] == 0){
                ans += 1;
                a[temp] = 1;
            }
        }
        System.out.println(ans -((N-ans)%2));
    }



//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        long N  = scanner.nextLong();
//        long amari = N % 11;
//        int ans = 0;
//        if(amari > 6)ans += 1;
//
//        System.out.println(2 * (N / 11) + ans + 1);
//    }







}


