import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(a);
        int ans = 0;
        for(int i=0; i<n-1; i++){
            if(x >= a[i]){
                x -= a[i];
                ans++;
            }
        }
        if(x == a[n-1]) ans++;
        System.out.println(ans);
    }
}