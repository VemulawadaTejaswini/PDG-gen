import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nm =  sc.nextLine();
        int n = Integer.parseInt(nm.split(" ")[0]);
        int m = Integer.parseInt(nm.split(" ")[1]);

        int[] l = new int[m];
        int[] r = new int[m];

        for (int i = 0; i < m; i++) {
            String lr = sc.nextLine();
            l[i] = Integer.parseInt(lr.split(" ")[0]);
            r[i] = Integer.parseInt(lr.split(" ")[1]);

        }

        int min, max;
        min = 1000000;
        max = 0;

        for (int i = 0; i < m; i++) {
            min = Math.min(min, r[i]);
            max = Math.max(max, l[i]);
        }

        if (min - max >= 0) {
            System.out.println(min - max + 1);
        } else {
            System.out.println(0);
        }

        return;
    }
}
