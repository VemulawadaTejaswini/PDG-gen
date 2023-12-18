import java.util.*;

public class Main {
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0 ;i<n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        boolean[] b = new boolean[1000001];
 
        int res = 0;
        for(int i=0; i<n; i++) {
            int num = a[i];
            if(!b[num] && !(i<n-1 && num == a[i+1])) res++;
            if(!b[num]) {
                for(int j = num; j<=1000000; j+=num) {
                    b[j] = true;
                }
            }
        }
        System.out.println(res);
    }
}