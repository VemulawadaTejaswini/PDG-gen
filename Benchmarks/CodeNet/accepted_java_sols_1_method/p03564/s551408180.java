import java.io.InputStream;
import java.util.Scanner;

/**
 * Created on 2017/10/29.
 */
public class Main {
    public static void main(String args[]){
        int ans = 1;

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        for (int i = 0; i < N; i++) {
            if(ans*2 < ans+K) {
                ans = ans * 2;
            }else{
                ans = ans + K;
            }
        }
    System.out.println(ans);

    }

}
