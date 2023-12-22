import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] h = new int[n];

        for( int i = 0 ; i < n ; i++){
            h[i] = scanner.nextInt();
        }

        Arrays.sort(h);
        long  hsum = 0;
        for( int i =  0 ; i < (n - k) ; i++){
            hsum += h[i];
        }

        System.out.println(hsum);
    }
}