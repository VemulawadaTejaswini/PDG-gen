
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());
        Integer k = Integer.parseInt(scanner.next());
        Integer q = Integer.parseInt(scanner.next());

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int[] a = new int[q];

        for(int i = 0; i < q; i++) {
            a[i] = Integer.parseInt(scanner.next());
        }

        int[] d = new int[n];
        for(int i = 0; i < n; i++) {
            d[i] = k;
        }

        for(int i= 0; i < a.length; i++) {
            d[a[i] -1] +=  1;
        }


        for(int i= 0; i < d.length; i++) {
            if(d[i] - q  > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
