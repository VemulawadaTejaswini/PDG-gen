
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        double[] b = new double[n];
        for(int i=0;i<n;i++){
            b[i] = (double)1.0/(double)a[i];
        }
        double c = 0;
        for(int i=0;i<n;i++){
            c += b[i];
        }
        System.out.println(1.0/c);
    }
}