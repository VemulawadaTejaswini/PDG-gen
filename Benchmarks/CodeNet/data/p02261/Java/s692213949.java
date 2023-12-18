import java.util.Scanner;

/**
 * C2
 */
public class Main {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int len = Integer.parseInt(sc.nextLine());
        final String[] line = sc.nextLine().split(" ");
        sc.close();
        final Card[] cardsForBubble = new Card[len];
        final Card[] cardsForSelect = new Card[len];
        for(int i=0; i<len; i++){
            cardsForBubble[i] = new Card(line[i]);
            cardsForSelect[i] = new Card(line[i]);
        }
        
        bubbleSort(cardsForBubble, len);
        selectionSort(cardsForSelect, len);
        StringBuilder val = new StringBuilder();

        for(int i=0; i<len; i++){
            val.append(cardsForBubble[i].card + " ");
        }
        System.out.println(val.toString().trim());
        System.out.println("Stable");

        val = new StringBuilder();
        Boolean isStable = true;
        for(int i=0; i<len; i++){
            if(cardsForBubble[i].card != cardsForSelect[i].card) isStable = false;
            val.append(cardsForSelect[i].card + " ");
        }
        System.out.println(val.toString().trim());
        if(isStable) System.out.println("Stable");
        else System.out.println("Not stable");
    }

    private static void bubbleSort(final Card[] arr, final int len){
        for(int i=0; i<len; i++){
            for(int j=len-1; j>i; j--){
                if(arr[j].number < arr[j-1].number){
                    final Card tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
    }

    private static void selectionSort(final Card[] arr, final int len){
        for(int i=0; i<len; i++){
            int minj = i;
            for(int j=i; j<len; j++){
                if(arr[j].number < arr[minj].number){
                    minj = j;
                }
            }
            final Card tmp = arr[minj];
            arr[minj] = arr[i];
            arr[i] = tmp;
        }
    }
}

class Card{   
    public char mark;
    public int number;
    public String card;
    public Card(final String card){
        this.card = card;
        this.mark = card.charAt(0);
        this.number = Integer.parseInt(card.substring(1, 2));
    }
}
