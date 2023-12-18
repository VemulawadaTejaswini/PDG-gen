import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static int[] A, m;
    public static int k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, q;
        int i, j;

        n = sc.nextInt();
        A = new int[n];
        for(i=0;i<n;i++){
            A[i] = sc.nextInt();
        }

        q = sc.nextInt();
        m = new int[q];
        for(i=0;i<q;i++){
            m[i] = sc.nextInt();
        }

        Arrays.sort(A);

        CycleA:
        for(i=0;i<q;i++) {

            k = n;

            for (j = 0; j < n; j++) {

                if (m[i] == A[j]) {
                    System.out.println("yes");
                    continue CycleA;                               
                } else if (m[i] < A[j]) {
                    k = j;
                    break;
                }

            }

            if( solve(0, m[i]) ){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

        }

    }

    public static boolean solve(int i, int m){

        if(m == 0){
            return true;
        }

        if(i >= k){
            return false;
        }

        boolean res = solve(i+1, m) || solve( i+1, m - A[i]);

        return res;
    }

}

