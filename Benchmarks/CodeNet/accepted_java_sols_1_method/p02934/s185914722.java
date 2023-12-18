import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Double[] a = new Double[n];
        double b = 1;
        for(int i=0; i< n; i++) {
            a[i] = sc.nextDouble();
            b = b*a[i];
        }
        double mo = 0;
        for(int j=0; j< n; j++){
            mo += b/a[j];
        }
        System.out.println(b/mo);

    }
}
