import java.util.*;

public class Main{
    static Scanner sc = new Scanner(System.in);
    static final int MOD = (int)1e9+7;
    
    public static void main(String[] args){
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int[] b = new int[n];
        int bmax = 0;
        for(int i=0; i<n; i++){
            int t = Integer.parseInt(sc.next());
            a[i] = t;
        }
        Arrays.sort(a);
        reverse(a);
        
        
        //にぶたん
        int ub = a[0];
        int lb = 1;
        for(int i=0; i<60; i++){
            int mid = (ub+lb)/2;
            int sum = 0;
            for(int j=0; j<n; j++){
                int m = (a[j]+mid-1)/mid-1;
                sum += m;
                //System.out.println(m);
            }
            //System.out.println(sum + " : " + mid);
            if(sum > k){
                lb = mid;
            }else{
                ub = mid;
            }
        }
        
        System.out.println(ub);
        
    }
    
    public static void reverse(int[] x){
        for(int i=0; i<x.length/2; i++){
            int tmp = x[i];
            x[i] = x[x.length-1-i];
            x[x.length-1-i] = tmp;
        }
    }
}
