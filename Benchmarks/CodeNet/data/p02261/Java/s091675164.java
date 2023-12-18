import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Card[] cards=new Card[n];
        for(int i=0;i<n;i++){
            cards[i]=new Card(scanner.next());
        }
        Card[] cardsB=cards.clone();
        Card[] cardsS=cards.clone();
        bubbleSort(cardsB,n);
        selectionSort(cardsS,n);
        System.out.println(Card.toString(cardsB));
        System.out.println(isStable(cards,cardsB)?"Stable":"Not Stable");
        System.out.println(Card.toString(cardsS));
        System.out.println(isStable(cards,cardsS)?"Stable":"Not Stable");


    }
    public static void bubbleSort(Card[] cards,int n){
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                if(cards[j].value<cards[j-1].value){
                    Card tmp=cards[j];
                    cards[j]=cards[j-1];
                    cards[j-1]=tmp;
                }
            }
        }
    }
    public static void selectionSort(Card[] cards,int n){
        for(int i=0;i<n;i++){
            int minj=i;
            for(int j=i;j<n;j++){
                if(cards[j].value<cards[minj].value){
                    minj=j;
                }
            }
            Card tmp=cards[minj];
            cards[minj]=cards[i];
            cards[i]=tmp;
        }
    }
    public static boolean isStable(Card[] origin,Card[] target){
        Card[] origin1=origin.clone();
        for(int i=0;i<origin.length;i++){
            Card maxCard=origin1[0];
            int maxi=0;
            for(int j=0;j<origin1.length;j++){
                //System.out.println("i,j,oriLen="+i+", "+j+", "+origin1.length);
                if(maxCard.value<=origin1[j].value){
                    maxCard=origin1[j];
                    maxi=j;
                }
            }
            //System.out.println("maxCard="+maxCard);
            List<Card> o=new ArrayList<>(Arrays.asList(origin1));
            o.remove(maxi);
            origin1=o.toArray(new Card[o.size()]);
            if(!target[target.length-i-1].equals(maxCard)){
                return false;
            }

        }
        return true;
    }
}

class Card{
    public int value;
    public char c;
    public Card(String s){
        value=Character.getNumericValue(s.charAt(1));
        c=s.charAt(0);
    }
    public static String toString(Card[] cards){
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<cards.length-1;i++){
            builder.append(cards[i].toString());
            builder.append(" ");
        }
        builder.append(cards[cards.length-1].toString());
        return builder.toString();
    }
    @Override
    public String toString() {
        return Character.toString(c)+Integer.toString(value);
    }
    @Override
    public int hashCode(){
        return 0;
    }
    @Override
    public boolean equals(Object o){
        Card o1 = (Card) o;
        if(o1.value==this.value&&o1.c==this.c){
            return true;
        }else{
            return false;
        }
    }
}
