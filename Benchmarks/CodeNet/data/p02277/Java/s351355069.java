import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Card[] a = new Card[n];
        Card[] a2 = new Card[n];
        for (int i = 0; i < n; i++) {
            Card c = new Card(scanner.next(), scanner.nextInt());
            a[i] = c;
            a2[i] = c;
        }
        sort(a, 0, a.length - 1);
        mergeSort(a2);
        boolean isStable = true;
        for (int i = 0; i < n; i++) {
            if (a[i] != a2[i]) {
                isStable = false;
                break;
            }
        }
        System.out.println(isStable ? "Stable" : "Not stable");
        for (Card c : a) {
            System.out.println(c.toString());
        }
    }

    private static int partition(Card[] a, int p, int r) {
        Card x = a[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (a[j].i <= x.i) {
                i++;
                Card t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        i++;
        Card t = a[i];
        a[i] = a[r];
        a[r] = t;
        return i;
    }

    private static void sort(Card[] a, int p, int r) {
        if (p < r) {
            int q = partition(a, p, r);
            sort(a, p, q - 1);
            sort(a, q + 1, r);
        }
    }

    private static void merge(Card[] a1, Card[] a2, Card[] a) {
        int i1 = 0;
        int i2 = 0;
        while (i1 < a1.length || i2 < a2.length) {
            if (i1 < a1.length && (i2 >= a2.length || a1[i1].i <= a2[i2].i)) {
                a[i1 + i2] = a1[i1++];
            } else {
                a[i1 + i2] = a2[i2++];
            }
        }
    }

    private static void mergeSort(Card[] a) {
        if (a.length < 2) {
            return;
        }
        int n1 = a.length / 2;
        int n2 = a.length - n1;
        Card[] a1 = new Card[n1];
        Card[] a2 = new Card[n2];
        for (int i = 0; i < n1; i++) {
            a1[i] = a[i];
        }
        for (int i = 0; i < n2; i++) {
            a2[i] = a[n1 + i];
        }
        mergeSort(a1);
        mergeSort(a2);
        merge(a1, a2, a);
    }

    private static class Card {
        String s;
        int i;

        private Card(String s, int i) {
            this.s = s;
            this.i = i;
        }

        public String toString() {
            return s + " " + String.valueOf(i);
        }
    }
}