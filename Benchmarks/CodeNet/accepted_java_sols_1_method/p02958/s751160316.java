import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int index = 0;
        int index2 = 0;
        for(int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
            if(a[i] == 1) index = i;
            if(a[i] == 2) index2 = i;
        }

        int cnt = 0;
        int now = 1;
        for(int i = index; i<n; i++) {
            if(a[i]==now) cnt++;
            now++;
        }
        if(cnt >= n-2) {
            System.out.println("YES");
            return;
        }
        cnt = 0;
        now = 2;
        for(int i = index2; i<n; i++) {
            if (a[i] == now) cnt++;
            now++;
        }
        if(cnt >= n-2) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");

    }
}