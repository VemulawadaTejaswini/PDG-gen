import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Card[] cards = new Card[n];
        for(int i = 0; i < n; i++){
            cards[i] = new Card(i);
        }
        //String[] in = br.readLine().split(" ");                                     
        //System.out.println("debug");                                                
        for(int i = 0; i < n; i++){
            String[] in = br.readLine().split(" ");
            //cards[i] = new Card(i);                                                 
            cards[i].picture = in[0];
            cards[i].value = Integer.parseInt(in[1]);
        }

        quickSort(cards, 0, n - 1);

        StringBuilder sb = new StringBuilder();
        if(isStable(cards, n)) sb.append("Stable\n");
        else sb.append("Not stable\n");

        for(int i = 0; i < n; i++){
            sb.append(cards[i].picture).append(" ").append(cards[i].value).append("\n\
");
        }

        System.out.print(sb);

    }
    public static void quickSort(Card[] cards, int p, int r){
        if(p < r){
            int q = partition(cards, p, r);
            quickSort(cards, p, q - 1);
            quickSort(cards, q + 1, r);
        }
    }

    public static int partition(Card[] cards, int p, int r){
        int x = cards[r].value;
        int i = p - 1;
        Card temp = new Card(0);
        for(int j = p; j < r; j++){
            if(cards[j].value <=  x){
                i = i + 1;
                temp = cards[i];
                cards[i] = cards[j];
                cards[j] = temp;
            }
        }
        temp = cards[i+1];
        cards[i+1] = cards[r];
        cards[r] = temp;
        return i + 1;
    }

    public static boolean isStable(Card[] cards, int n){
        for(int i = 0; i < n - 1; i++){
            if(cards[i].value == cards[i+1].value){
                if(cards[i].numForStable > cards[i+1].numForStable)return false;
            }
        }
        return true;
    }

}

class Card{
    String picture;
    int value;
    int numForStable;
    Card(int i){
        this.numForStable = i;
    }
}