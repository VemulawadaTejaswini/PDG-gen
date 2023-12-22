import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
    
        int n = Integer.parseInt(sc.next());
        var a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
    
        Arrays.sort(a);
        long ans = a[n-1];
        int j = n-2;
        for(int i = 0; i < n-2; i++){
            ans += a[j];
            if(i%2 == 1) j--;
        }
        System.out.println(ans);
    }
}