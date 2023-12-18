import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Card {
    char name;
    char value;

    Card(char name, char value) {
        this.name = name;
        this.value = value;
    }
}

class Main {
    public static Card[] BubbleSort(Card[] cards, int n) {
        Card tmp;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= i + 1; j--) {
                if (cards[j - 1].value > cards[j].value) {
                    tmp = cards[j - 1];
                    cards[j - 1] = cards[j];
                    cards[j] = tmp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (i != 0)
                System.out.print(" ");
            System.out.printf("%c%c", cards[i].name, cards[i].value);
        }
        System.out.print("\nStable\n");
        return cards;
    }

    public static Card[] SelectSort(Card[] cards, int n) {
        int minIdx;
        Card tmp;
        for (int i = 0; i < n; i++) {
            minIdx = i;
            for (int j = i; j < n; j++) {
                if (cards[minIdx].value > cards[j].value)
                    minIdx = j;
            }
            tmp = cards[i];
            cards[i] = cards[minIdx];
            cards[minIdx] = tmp;
        }

        for (int i = 0; i < n; i++) {
            if (i != 0)
                System.out.print(" ");
            System.out.printf("%c%c", cards[i].name, cards[i].value);
        }
        System.out.print("\n");
        return cards;
    }

    public static void isStable(Card[] a, Card[] b, int n) {
        for (int i = 0; i < n; i++) {
            if (a[i].name != b[i].name) {
                System.out.print("Not stable\n");
                return;
            }
        }
        System.out.print("Stable\n");
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        Card[] cards, cards2;

        String[] inputData;
        try {
            n = Integer.parseInt(br.readLine());
            cards = new Card[n];
            cards2 = new Card[n];
            inputData = br.readLine().split(" ");

            for (int i = 0; i < n; i++) {
                cards[i] = new Card(inputData[i].charAt(0), inputData[i].charAt(1));
                cards2[i] = new Card(inputData[i].charAt(0), inputData[i].charAt(1));
            }

            isStable(BubbleSort(cards, n), SelectSort(cards2, n), n);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
