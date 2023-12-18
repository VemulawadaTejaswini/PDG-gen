import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public Main() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Card bArray[] = new Card[36];
        Card sArray[] = new Card[36];


        for (int i = 0; i < n; i++) {
            String cardInfo = scan.next();
            bArray[i] = new Card(cardInfo.charAt(0), Integer.valueOf(cardInfo.substring(1, cardInfo.length())));
        }
        sArray = Arrays.copyOf(bArray, n);

        bubbleSort(n, bArray);
        selectionSort(n, sArray);

        printArray(n, bArray);
        System.out.println("Stable");
        printArray(n, sArray);
        if(isStable(n,bArray,sArray)){
            System.out.println("Stable");
        }else{
            System.out.println("Not stable");
        }

    }

    public static boolean isStable(int n, Card[] cards1, Card[] cards2) {
        for (int i = 0; i < n; i++) {
            if (!cards1[i].equals(cards2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void bubbleSort(int n, Card[] cards) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = n - 1; i >= 1; i--) {
                if (cards[i].number < cards[i - 1].number) {
                    // 要素の交換
                    Card tmp = cards[i];
                    cards[i] = cards[i - 1];
                    cards[i - 1] = tmp;
                    flag = true;
                }
            }
        }
    }

    public static void selectionSort(int n, Card[] cards) {
        int minj;
        int i, j;
        for (i = 0; i < n - 1; i++) {
            minj = i;
            for (j = i; j < n; j++) {
                if (cards[minj].number > cards[j].number) {
                    minj = j;
                }
            }
            if (i != minj) {
                Card tmp;
                tmp = cards[i];
                cards[i] = cards[minj];
                cards[minj] = tmp;
            }

        }
    }

    // スペース区切りで表示
    public static void printArray(int n, Card A[]) {
        int i;
        for (i = 0; i < n - 1; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println(A[i]);
    }

    public class Card {
        public char suit;
        public int number;

        public Card(char suit, int number) {
            this.suit = suit;
            this.number = number;
        }

        @Override
        public String toString() {
            return suit + String.valueOf(number);
        }

        // 簡易比較
        @Override
        public boolean equals(Object target) {
            Card tCard = (Card) target;
            return number == tCard.number && suit == tCard.suit;
        }
    }

    public static void main(String[] args) {
        new Main();
    }

}