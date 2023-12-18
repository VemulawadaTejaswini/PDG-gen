import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[1001];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            a[i] = x;
            b[x]++;
        }
        Arrays.sort(a);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int s = a[i] + a[j];
                int l = 0, r = n;
                while(1 < r - l){
                    int m = (l+r)/2;
                    if(s <= a[m]) r = m;
                    else l = m;
                }
                ans += l - j;
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
