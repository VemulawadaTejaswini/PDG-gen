import java.util.*;

class Main {

    static class Card{
        final String key;
        final int value;

        Card(String k, int v){
            key = k;
            value = v;
        }
        @Override
        public String toString() {
            return key + value;
        }
    }

    private static Card[] bubbleSort(Card[] C){
        int n = C.length;

        for (int i = 0; i < n; i++) {
            for (int j = n-1; j > i ; j--)
                if(C[j].value < C[j-1].value){
                    // swap
                    Card temp = C[j];
                    C[j] = C[j-1];
                    C[j-1] = temp;
                }
        }
        return C;
    }

    private static Card[] selectionSort(Card[] C){
        int n = C.length;

        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i; j < n - 1; j++) {
                if (C[j].value <= C[mini].value)
                    mini = j;
            }
            // swap
            if(mini != i) {
                Card temp = C[i];
                C[i] = C[mini];
                C[mini] = temp;
            }
        }
        return C;
    }

    /**
     *
     * @param a is the list of card after bubble sort, which is stable
     * @param b is the list of card after selection sort,
     *          which is sometimes not stable
     * @return return true if the list after selection sort is table,
     *          otherwise, false.
     */
    private static boolean isStable(Card[] a, Card[] b){
        for (int i = 0; i < a.length; i++)
            if (a[i].key != b[i].key)
                return false;
        return true;
    }

    // print the list of cards
    private static void print(Card[] cards){
        int n = cards.length;
        for (int i = 0; i < n - 1; i++)
            System.out.print(cards[i].toString() + " ");
        System.out.print(cards[n-1].toString());
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Card[] cards = new Card[n];
        // get all cards from input, and store it to cards
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            cards[i] = new Card(s.substring(0,1),Integer.parseInt(s.substring(1)));
        }

        bubbleSort(cards);
        Card[] bubble = new Card[n];
        // since all method here is static, I need to store the list
        // of card after bubble sort to a new variable bubble
        for (int i = 0; i < n; i++)
            bubble[i] = cards[i];
        print(bubble);
        // bubble sort is always stable
        System.out.println("\nStable");

        // Now, let's do the selection sort
        Card[] selection = selectionSort(cards);
        print(selection);
        if (isStable(bubble,selection)) System.out.println("\nStable");
        else System.out.println("\nNot stable");

    }
}

