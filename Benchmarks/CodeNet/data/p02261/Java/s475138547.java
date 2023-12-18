import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        Card[] cards1 = new Card[N];
        Card[] cards2 = new Card[N];
        for (int i = 0; i < N; i++){
            String tmp = input.next();
            Card tmpcard = new Card((int)tmp.charAt(1),i,tmp);
            cards1[i] = tmpcard;
            cards2[i] = tmpcard;
        }
        BubbleSort(cards1,N);
        SelectionSort(cards2,N);
        String ans = "Stable";
        for (int i = 0; i < N; i++){
            if (i == N-1){
                System.out.println(cards1[i].presentation);
            } else {
                if (cards1[i].value == cards1[i+1].value && cards1[i].index > cards1[i+1].index){
                    ans = "Not stable";
                }
                System.out.printf("%s ",cards1[i].presentation);
            }
        }
        System.out.println(ans);
        ans = "Stable";
        for (int i = 0; i < N; i++){
            if (i == N-1){
                System.out.println(cards2[i].presentation);
            } else {
                if (cards2[i].value == cards2[i+1].value && cards2[i].index > cards2[i+1].index){
                    ans = "Not stable";
                }
                System.out.printf("%s ",cards2[i].presentation);
            }
        }
        System.out.println(ans);
    }
    public static void BubbleSort(Card[] C, int N){
        Card tmp;
        for (int i = 0; i < N; i++){
            for (int j = N - 1; j > i; j--){
                if (C[j].value < C[j-1].value){
                    tmp = C[j];
                    C[j] = C[j-1];
                    C[j-1] = tmp;
                }
            }
        }
    }
    public static void SelectionSort(Card[] C, int N){
        int minj;
        Card tmp;
        for (int i = 0; i < N; i++){
            minj = i;
            for (int j = i; j < N; j++){
                if (C[j].value < C[minj].value){
                    minj = j;
                }
            }
            tmp = C[i];
            C[i] = C[minj];
            C[minj] = tmp;
        }
    }
}

class Card {
    public int value,index;
    public String presentation;

    Card(int a, int b, String c){
        value = a;
        index = b;
        presentation = c;
    }
}
