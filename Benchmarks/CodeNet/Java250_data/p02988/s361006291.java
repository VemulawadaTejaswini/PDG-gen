import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int cnt = 0;
        for(int i = 0; i<n-2; i++) {
            if(a[i]<a[i+1] && a[i+1]<=a[i+2]) cnt++;
            if(a[i+2]<a[i+1] && a[i+1]<=a[i]) cnt++;
        }
        System.out.println(cnt);
    }
}