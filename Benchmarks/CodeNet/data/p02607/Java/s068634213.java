import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        int cnt = 0;
        for (int i = 0; i < n; i += 2) {
            if (a[i] % 2 == 1) cnt++;
        }
       
        System.out.println(cnt);
    }
}

