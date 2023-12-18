import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

class Card {
    char suit;
    int num;

    Card(String[] line) {
        suit = line[0].charAt(0);
        num = Integer.parseInt(line[1]);
    }

    Card(char c, int n) {
        suit = c;
        num = n;
    }

    @Override
    public String toString() {
        return suit + " " + num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suit == card.suit &&
                num == card.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, num);
    }
}

public class Main {
    static final Card SENTINEL = new Card('X', Integer.MAX_VALUE);

    static void merge(Card[] A, int left, int mid, int right) {
        int n1 = mid - left;
        int n2 = right - mid;

        Card[] L = new Card[n1 + 1];
        Card[] R = new Card[n2 + 1];
        System.arraycopy(A, left, L, 0, n1);
        System.arraycopy(A, mid, R, 0, n2);
        L[n1] = SENTINEL;
        R[n2] = SENTINEL;

        int i = 0;
        int j = 0;
        for (int k = left; k < right; k++) {
            if (L[i].num <= R[j].num) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
        }
    }

    static void mergeSort(Card[] A, int left, int right) {
        if (left + 1 < right) {
            int mid = (left + right) / 2;
            mergeSort(A, left, mid);
            mergeSort(A, mid, right);
            merge(A, left, mid, right);
        }
    }

    static void swap(Card[] A, int i, int j) {
        Card tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    static int partition(Card[] A, int p, int r) {
        Card x = A[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (A[j].num <= x.num) {
                i++;
                swap(A, i, j);
            }
        }
        swap(A, i + 1, r);
        return i + 1;
    }

    static void quickSort(Card[] A, int p, int r) {
        if (p < r) {
            int q = partition(A, p, r);
            quickSort(A, p, q - 1);
            quickSort(A, q + 1, r);
        }
    }

    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(in.readLine());
            Card[] A = new Card[n];
            Card[] A2 = new Card[n];
            for (int i = 0; i < n; i++) {
                Card c = new Card(in.readLine().split(" "));
                A[i] = c;
                A2[i] = c;
            }

            quickSort(A, 0, n - 1);
            mergeSort(A2, 0, n);

            if (Arrays.equals(A, A2)) {
                System.out.println("Stable");
            } else {
                System.out.println("Not stable");
            }

            StringBuilder out = new StringBuilder();
            for (int i = 0; i < n; i++) {
                out.append(A[i].suit).append(" ").append(A[i].num).append("\n");
            }
            System.out.print(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

