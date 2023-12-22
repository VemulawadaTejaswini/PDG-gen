import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] H = new int[N];
        for(int i=0; i<N; i++) {
            H[i] = sc.nextInt();
        }

        Arrays.sort(H);
        long attackTimes = 0;
        
        for(int ri = N-1; ri>=0; ri--) {
            if(K>0) {
                K--;
            }else {
                attackTimes += H[ri];
            }
        }
        
        System.out.println(attackTimes);


    }

}
