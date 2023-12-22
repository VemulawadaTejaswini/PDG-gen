import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[2*n];
        int[] ss = new int[n];
        for(int i = 0; i< 2*n ; i++){
            s[i] = sc.nextInt();
        }
        Arrays.sort(s);
        for(int k =0; k< n;k++){
            ss[k] = Math.min(s[2*k], s[2*k +1]);
        }
        int sum=0;
        for(int j=0; j < n; j++){
            sum += ss[j];
        }
        System.out.println(sum);






    }
}
