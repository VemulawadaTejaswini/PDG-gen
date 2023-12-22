
import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n];
        long ans = 0;
        for(int i = 0;i < n+1;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0;i < n;i++){
            b[i] = sc.nextInt();
        }
        for(int i = 0;i< n;i++){
            if(a[i] < b[i]){
                ans += a[i];
                b[i] -= a[i];
                if(a[i+1]<b[i]){
                    ans += a[i+1];
                    a[i+1]=0;
                }else{
                    ans += b[i];
                    a[i+1] -= b[i];
                }
            } else {
                ans += b[i];
            }
        }
        System.out.print(ans);
    }
    
}
