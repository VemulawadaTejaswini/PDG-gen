// Why do we fall ? So we can learn to pick ourselves up.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ll = new int[n];
        for(int i=0; i<n; i++){
            ll[i] = sc.nextInt();
        }
        Arrays.sort(ll);
        int ss = 0;
        for(int i=0; i<n-2; i++){
            int k = i+2;
            for(int j=i+1; j<n; j++){
                while(k<n && ll[i]+ll[j] > ll[k]){
                    ++k;
                }
                if(k>j){
                    ss += k-j-1;
                }
            }
        }
        System.out.println(ss);
    }
}
