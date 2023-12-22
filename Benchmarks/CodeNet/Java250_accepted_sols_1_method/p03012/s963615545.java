import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];
        int tot = 0;
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
            tot += a[i];
        }

        int best = Integer.MAX_VALUE, cur = 0;
        for(int i=0;i<n-1;i++){
            cur += a[i];
            best = Math.min(Math.abs(tot-2*cur),best);
        }

        System.out.println(best);
        in.close();
    }
}