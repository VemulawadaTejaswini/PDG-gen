import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            while(n!=0){
                int[] cards = new int[n];
                for (int i = 0; i < cards.length; i++) {
                    cards[i] = cards.length - i ;
                }
                int r = sc.nextInt();
                for (int i = 0; i < r ; i++) {
                    int p = sc.nextInt();
                    int c = sc.nextInt();
                    int[] tmpcards = new int[p-1];

                    for (int j = 0; j < p-1; j++) {
                        tmpcards[j] = cards[j] ;
                    }

                    for (int j = 0; j < c; j++) {
                        cards[j] = cards[j + p - 1] ;
                    }

                    for (int j = 0; j < p-1; j++) {
                        cards[j+c] = tmpcards[j] ;
                    }
                }
                System.out.println(cards[0]);
                n = sc.nextInt();
            }
        }
    }
}

