
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author bhatti
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] sk = new int[2 * N];
        for( int i = 0 ; i < 2 * N ; ++i){
            sk[i] = sc.nextInt();
        }
        
        Arrays.sort(sk);
        
        int total = 0;
        for(int  i = 0 ; i < 2 * N ; i += 2){
            total += sk[i];
        }
        System.out.println(total);
    }
        
}
