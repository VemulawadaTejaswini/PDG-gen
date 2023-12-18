
import java.util.*;

/**
 * A
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int flag = 0, count = 0, left, right;

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

        for(int i=0; i<q; i++) {

            int key = T[i];
            flag = 0;
            left = 0;
            right = S.length;

            while(left<right) {

                int mid = (left+right)/2;

                if(key == S[mid]) {
                    flag++;
                    break;
                }

                if(key > S[mid]) {
                    left = mid+1;
                } else if(key < S[mid]) {
                    right = mid;
                }

            }

            if(flag >= 1) {
                count++;
            }

        }

        System.out.println(count);

    }
}
