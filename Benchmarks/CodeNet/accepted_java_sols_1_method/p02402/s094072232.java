import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        long min = a[0];
        long max = a[0];
        long sum = a[0];
        
        for(int i=1;i<n;i++){
            if(min>a[i]){min=a[i];}
            if(max<a[i]){max=a[i];}
            sum += a[i];
        }
        System.out.println(min + " " + max + " " + sum);
    }
}
