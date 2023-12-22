import java.util.Scanner;

/**
 * Created by Sohail on 9/7/2019.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        long[] b = new long[x];
        for(int i = 0; i < x-1; i++){
            b[i] = sc.nextInt();
        }
        long tot = b[0];
        for(int i = 0; i < x-1; i++){
            tot += Math.min(b[i],b[i+1]);
        }
        System.out.println(tot+b[x-2]);
    }
}

