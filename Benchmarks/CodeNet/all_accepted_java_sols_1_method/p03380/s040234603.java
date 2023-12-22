import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a=new long[n];
        long max = Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
            max = Math.max(max,a[i]);
        }
        long absDif = Long.MAX_VALUE;
        int pos = n-1;
        if(max%2==0){
            for(int j=0;j<n;j++){
                if(a[j]==max) continue;
                long cur = Math.abs(a[j]-max/2);
                if(cur<=absDif){
                    pos = j;
                    absDif = cur;
                }
            }
        }
        else{
            for(int j=0;j<n;j++){
                long cur = Math.min(Math.abs(a[j]-(max+1)/2),Math.abs(a[j]-(max-1)/2));
                if(cur<=absDif){
                    pos = j;
                    absDif = cur;
                }
            }
        }
        String ans = max+" "+a[pos];
        System.out.println(ans);
    }
}
