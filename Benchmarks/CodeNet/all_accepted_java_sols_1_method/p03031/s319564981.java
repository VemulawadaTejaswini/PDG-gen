
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0 ; i < m ; i++) {
            int k = sc.nextInt();
            List<Integer> l = new ArrayList<>();
            for (int j = 0 ; j < k ; j++) {
                l.add(sc.nextInt());
            }

            list.add(l);
        }

        int[] p = new int[m];

        for (int i = 0 ; i < m ; i++) {
            p[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0 ; i < Math.pow(2, n) ; i++) {
            boolean flg = true;
            int[] b = new int[10];
            int temp = i;
            int index = 0;
            while (temp > 0) {
                b[index] = temp % 2;
                temp /= 2;
                index++;
            }
            for (int j = 0 ; j < m ; j++) {
                int d = 0;
                for (int k = 0 ; k < list.get(j).size() ; k++) {
                    if (b[list.get(j).get(k) - 1] == 1) d++;
                }
                if (d % 2 != p[j]) {
                    flg = false;
                }
            }
            if (flg) count++;
        }

        System.out.println(count);

    }

}