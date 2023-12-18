import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        Card[] c1 = new Card[n];
        for(int i = 0; i < n; i++){
            String s = sc.next();
            c1[i] = new Card(s.substring(0, 1), Integer.parseInt(s.substring(1, 2)));
        }
        Card[] c2 = c1.clone();
        
        bubbleSort(c1, n);
        selectionSort(c2, n);
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(c1[i].suit).append(c1[i].value);
            if(i < n-1){
                sb.append(" ");
            }else{
                sb.append(System.lineSeparator());
                sb.append("Stable").append(System.lineSeparator());
            }
        }
        
        for(int i = 0; i < n; i++){
            sb.append(c2[i].suit).append(c2[i].value);
            if(i < n-1){
                sb.append(" ");
            }else{
                sb.append(System.lineSeparator());
            }
        }
        boolean stable = true;
        for(int i = 0; i < n; i++){
            if(!c1[i].suit.equals(c2[i].suit)){
                stable = false;
                break;
            }
        }
        if(stable){
            sb.append("Stable").append(System.lineSeparator());
        }else{
            sb.append("Not stable").append(System.lineSeparator());
        }
        
        System.out.print(sb);
    }
    
    static class Card {
        String suit;
        int value;

        public Card(String suit, int value) {
            this.suit = suit;
            this.value = value;
        }
    }
    
    static void bubbleSort(Card[] c, int n){
        
        for(int i = 0; i < n; i++){
            for(int j = n-1; j >= i+1; j--){
                if(c[j].value < c[j-1].value){
                    Card a = c[j];
                    c[j] = c[j-1];
                    c[j-1] = a;
                }
            }
        }
    }
    
    static void selectionSort(Card[] c, int n){
        
        for(int i = 0; i < n; i++){
            int minj = i;
            for(int j = i; j < n; j++){
                if(c[j].value < c[minj].value){
                    minj = j;
                }
            }
            Card a = c[minj];
            c[minj] = c[i];
            c[i] = a;
        }
    }
}
