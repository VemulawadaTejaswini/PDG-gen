import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int[] a = new int[n];
        long sum = 0;
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
            sum += a[i];
        }
        if(sum == x){
            System.out.println(n);
        }else if(sum > x){
            Arrays.sort(a);
            int out = 0;
            for(int i = 0; i < n && x > 0; i++){
                x -= a[i];
                out++;
            }
            System.out.println(x == 0 ? out : out - 1);
        }else{
            System.out.println(n - 1);
        }
        scan.close();
    }
}