import java.util.*;

public class Main {
    public static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        n = Scan.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) arr[i] = Scan.nextInt();

        int ans = 0;

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    if(arr[i]==arr[j] || arr[i]==arr[k] || arr[j]==arr[k]) continue;
                    int x = arr[i], y = arr[j], z = arr[k];
                    if(x > y) {x ^= y; y ^= x; x ^= y;}
                    if(x > z) {x ^= z; z ^= x; x ^= z;}
                    if(y > z) {y ^= z; z ^= y; y ^= z;}

                    if(x + y > z) ans++;
                }
            }
        }

        System.out.println(ans);
    }
}