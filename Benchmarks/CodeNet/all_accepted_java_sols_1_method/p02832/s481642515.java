import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int res = 0;
        int next = 1;
        for(int i=0; i<n; i++) {
            if(a[i] == next) {
                next++;
            } else {
                res++;
            }
        }
        if(next == 1) {
            System.out.println(-1);
        } else {
            System.out.println(res);
        }
    }
}
