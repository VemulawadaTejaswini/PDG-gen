import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        sc.close();
        int s = 2147483646;
        for(int i = a[0] ; i <= a[n - 1] ; i++ ){
            int k = 0;
            for(int j = 0 ; j < n ; j++ ){
                k += (a[j] - i) * (a[j] - i);
            }
            s = Math.min(s , k);
        }
        System.out.println(s);
    }
}