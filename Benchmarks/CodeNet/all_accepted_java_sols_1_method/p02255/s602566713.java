import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPlayingCards = sc.nextInt();
        int numList[] = new int[totalPlayingCards];
        for(int i = 0; i<totalPlayingCards; i++){
            int PlayingCardsNum = sc.nextInt();
            numList[i] = PlayingCardsNum;
        }
        for(int i = 0; i<totalPlayingCards; i++){
            int v = numList[i];
            int j = i - 1;
            while(j >= 0 && numList[j] > v){
                numList[j+1] = numList[j];
                j--;
                numList[j+1] = v;
            }
            for(int k = 0; k<totalPlayingCards; k++){
                if(k == totalPlayingCards-1){
                    System.out.print(numList[k]);
                }else{
                    System.out.print(numList[k] + " ");
                }
            }
            System.out.println("");
        }
    }
}
