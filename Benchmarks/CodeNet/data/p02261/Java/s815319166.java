import java.util.Scanner;

public class Main {

    static class Poker {
        String color;
        Integer num;

        public Poker(String color, Integer num) {
            this.color = color;
            this.num = num;
        }

        @Override
        public String toString() {
            return this.color + this.num + "";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Poker[] po1 = new Poker[n];
        Poker[] po2 = new Poker[n];
        for (int i = 0; i < po1.length; i++) {
            String next = sc.next();
            String a = String.valueOf(next.charAt(0));
            Integer b = Integer.parseInt(String.valueOf(next.charAt(1)));
            Poker poker = new Poker(a, b);
            po1[i] = poker;
            po2[i] = poker;
        }
        bubble(po1);
        SelectionSort(po2);
        if (isStable(po1, po2)) System.out.print("Stable\n");
        else System.out.print("Not stable\n");
    }

    private static boolean isStable(Poker[] po1, Poker[] po2) {
        for (int i = 0; i < po1.length; i++) {
            if (!po1[i].color.equals(po2[i].color)) return false;
        }
        return true;
    }

    private static Poker[] SelectionSort(Poker[] po) {
        for (int i = 0; i < po.length; i++) {
            int min = i;
            for (int j = i; j < po.length; j++) {
                if (po[j].num < po[min].num) {
                    min = j;
                }
            }
            if (i != min) po = swap(po, i, min);
        }
        print(po);
        return po;
    }

    private static Poker[] bubble(Poker[] po) {
        for (int i = 0; i < po.length; i++) {
            for (int j = po.length - 1; j > i; j--) {
                if (po[j].num < po[j - 1].num) {
                    po = swap(po, j, j - 1);
                }
            }
        }
        print(po);
        System.out.print("Stable\n");
        return po;
    }


    private static void print(Poker[] po) {
        for (int i = 0; i < po.length - 1; i++) {
            System.out.print(po[i] + " ");
        }
        System.out.print(po[po.length - 1] + "\n");
    }

    private static Poker[] swap(Poker[] po, int j, int i) {
        Poker poker = po[j];
        po[j] = po[i];
        po[i] = poker;
        return po;
    }
}
