import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int cnt = 0;
        int min = Integer.MAX_VALUE;
        long ans = 0;
        for(int i = 0; i<N; i++) {
            a[i] = sc.nextInt();
            if(a[i]<0) {
                cnt++;
                a[i] = -1*a[i];
            }
            ans += a[i];
            min = Math.min(a[i], min);
        }

        if(cnt%2==0) {
            System.out.println(ans);
        }else {
            System.out.println(ans-min-min);
        }

    }
}