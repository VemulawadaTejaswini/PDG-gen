
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);
        if (n % 2 == 0) {
            double amed = (double) (a[n/2 - 1] + a[n/2]) / 2;
            double bmed = (double) (b[n/2 - 1] + b[n/2]) /2;
            int ans =(int)( (bmed - amed + 0.5) * 2);
            System.out.println(ans);
        } else {
            int amed = a[(n + 1)/2 - 1];
            int bmed = b[(n + 1)/2 - 1];
            System.out.println(bmed - amed + 1);
        }
    }

}
