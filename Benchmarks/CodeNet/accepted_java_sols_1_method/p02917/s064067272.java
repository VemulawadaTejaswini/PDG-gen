import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() - 1;

        int res = 0;
        int[] b = new int[n];
        for(int i=0; i<n; i++) {
            b[i] = sc.nextInt();
        }
        for(int i=0; i<n-1; i++) {
            res += Math.min(b[i], b[i+1]);
        }
        res += b[0] + b[n-1];

        System.out.println(res);
    }

}
