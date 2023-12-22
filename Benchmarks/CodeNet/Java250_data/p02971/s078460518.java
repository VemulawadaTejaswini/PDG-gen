import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; ++i){
            a[i] = input.nextInt();
            b[i] = a[i];
        }
        Arrays.sort(b);
        int minx = b[n - 2];
        int maxx = b[n - 1];
        for(int i = 0; i < n; ++i){
            if(a[i] == maxx) System.out.println(minx);
            else System.out.println(maxx);
        }
    }
}
