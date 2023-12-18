import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    static Scanner s = new Scanner(System.in);
    static ArrayList<AmidaSwitch> list = new ArrayList<AmidaSwitch>();

    static class AmidaSwitch {
        int h, p, q;

        AmidaSwitch(int h, int p, int q) {
            this.h = h;
            this.p = p;
            this.q = q;
        }

        public int getH() {
            return h;
        }
    }

    static class AmidaComparator implements Comparator<AmidaSwitch> {
        public int compare(AmidaSwitch a, AmidaSwitch b) {
            int no1 = a.getH();
            int no2 = b.getH();

            if (no1 > no2) {
                return 1;
            } else if (no1 == no2) {
                return 0;
            } else {
                return -1;
            }
        }
    }

    public static void main(String[] args) {

        while (true) {
            int n = s.nextInt();
            int m = s.nextInt();
            int a = s.nextInt();

            if (n == 0 && m == 0 && a == 0) break;

            int[] amida = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                amida[i] = i;
            }

            for (int i = 0; i < m; i++) {
                int h = s.nextInt();
                int p = s.nextInt();
                int q = s.nextInt();
                list.add(new AmidaSwitch(h, p, q));
            }

            Collections.sort(list, new AmidaComparator());

            for (int i = 0; i < list.size(); i++) {
                AmidaSwitch tempAmida = list.get(i);

                int temp = amida[tempAmida.p];
                amida[tempAmida.p] = amida[tempAmida.q];
                amida[tempAmida.q] = temp;
            }

            System.out.println(amida[a]);
        }
    }


}