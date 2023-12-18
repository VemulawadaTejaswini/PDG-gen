import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int ans = 0;
        int c = 1;
        while(c < n){
            c+= k-1;
            ans ++;
        }
        System.out.println(ans);
    }
}