import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> xi = new ArrayList<>();
        List<Integer> yi = new ArrayList<>();
        double D1 = 0;
        double D2 = 0;
        double D3 = 0;
        double D4 = 0;
        int k = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            xi.add(x);
        }
        for (int i = 0; i < n; i++) {
            int y = sc.nextInt();
            yi.add(y);
        }
        for (int i = 0; i < n; i++) {
            k = Math.abs(xi.get(i) - yi.get(i));
            D1 += k;
            D2 += Math.pow(k,2);
            D3 += Math.pow(k,3);
            if(D4 < k)
                D4 = k;
        }
        System.out.println(D1);
         System.out.println(Math.sqrt(D2));
          System.out.println(Math.cbrt(D3));
           System.out.println(D4);
    }
}