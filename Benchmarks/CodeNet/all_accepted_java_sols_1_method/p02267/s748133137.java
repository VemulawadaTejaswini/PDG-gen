
import java.util.*;

/**
 * A
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int flag = 0, count = 0;

        int n = sc.nextInt();
        int[] S = new int[n];

        for(int i=0; i<n; i++) {
            S[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        int[] T = new int[q];

        for (int i = 0; i<q; i++) {
            T[i] = sc.nextInt();
        }

        sc.close();

        for(int j=0; j<q; j++) {
            flag = 0;
            for(int i=0; i<n; i++) {
                if(S[i] == T[j]) {
                    flag++;
                    break;
                }
            }
            if(flag >= 1) {
                count++;
            } 
        }

        System.out.println(count);

    }
}
