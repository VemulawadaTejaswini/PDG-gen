import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

class Card {
    String color;
    int num;

    static Card of(String s) {
        Card c = new Card();
        c.color = s.substring(0, 1);
        c.num = Integer.parseInt(s.substring(1));
        return c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return num == card.num &&
                Objects.equals(color, card.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, num);
    }

    @Override
    public String toString() {
        return color + num;
    }
}

public class Main {
    static void bubbleSort(int N, Card[] A) {
        for (int i = 0; i < N; i++) {
            for (int j = N - 1; j > i; j--) {
                if (A[j].num < A[j - 1].num) {
                    Card tmp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = tmp;
                }
            }
        }
    }

    static void selectionSort(int N, Card[] A) {
        for (int i = 0; i < N; i++) {
            int minj = i;
            for (int j = i; j < N; j++) {
                if (A[j].num < A[minj].num) {
                    minj = j;
                }
            }
            if (minj != i) {
                Card tmp = A[i];
                A[i] = A[minj];
                A[minj] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(in.readLine());
            Card[] A = Arrays.stream(in.readLine().split(" ")).map(Card::of).toArray(Card[]::new);
            Card[] A2 = Arrays.copyOf(A, N);

            bubbleSort(N, A);
            selectionSort(N, A2);

            System.out.println(Arrays.stream(A).map(Card::toString).collect(Collectors.joining(" ")));
            System.out.println("Stable");

            System.out.println(Arrays.stream(A2).map(Card::toString).collect(Collectors.joining(" ")));
            if (Arrays.equals(A, A2)) {
                System.out.println("Stable");
            } else {
                System.out.println("Not stable");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
