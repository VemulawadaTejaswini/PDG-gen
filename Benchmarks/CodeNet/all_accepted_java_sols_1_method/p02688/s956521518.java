import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] b = new boolean[n];
        int k = sc.nextInt();
        for(int i=0; i<k; i++) {
            int d = sc.nextInt();
            for(int j=0; j<d; j++) {
                int l = sc.nextInt() -1;
                b[l] = true;
            }
        }
        int res = 0;
        for(int i=0; i<n; i++) {
            if(!b[i]) res++;
        }
        System.out.println(res);
    }
}