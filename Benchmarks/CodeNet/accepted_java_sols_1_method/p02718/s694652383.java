import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;

        for(int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        Arrays.sort(a);
        boolean ok = true;
        for(int i = 1 ; i <= m ; i++){
            if(a[n-i]*(4*m) < sum){
                ok = false;
            }
        }

        System.out.println(ok?"Yes":"No");
    }
}
