import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Card[] a1 = new Card[N];
        Card[] a2 = new Card[N];
        for (int i = 0; i < N; i++) {
            Card c = new Card(scanner.next());
            a1[i] = c;
            a2[i] = c;
        }
        bubbleSort(a1);
        selectionSort(a2);
        String s1 = result(a1);
        String s2 = result(a2);
        System.out.println(s1);
        System.out.println("Stable");
        System.out.println(s2);
        System.out.println(s1.equals(s2) ? "Stable" : "Not stable");
    }

    private static void bubbleSort(Card[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j].n < a[j - 1].n) {
                    Card t = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = t;
                }
            }
        }
    }

    private static void selectionSort(Card[] a) {
        for (int i = 0; i < a.length; i++) {
            int mi = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].n < a[mi].n) {
                    mi = j;
                }
            }
            if (i != mi) {
                Card t = a[i];
                a[i] = a[mi];
                a[mi] = t;
            }
        }
    }

    private static String result(Card[] a) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i].toString());
            if (i != a.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    private static class Card {
        String m;
        int n;

        private Card(String s) {
            this.m = String.valueOf(s.charAt(0));
            this.n = Character.getNumericValue(s.charAt(1));
        }

        public String toString() {
            return m + String.valueOf(n);
        }
    }
}