import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int[] sum = new int[2];
        for(int i=0; i<n; i++) {
            sum[i%2] += a[i];
        }

        System.out.println(n%2 == 1 ? sum[0] - sum[1] : sum[1] - sum[0]);
    }


}
