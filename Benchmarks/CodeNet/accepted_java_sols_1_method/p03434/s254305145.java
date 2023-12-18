import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] cardList = new int[n];
        int[] player = new int[2];
        for(int i=0;i<n;i++){
            cardList[i] = s.nextInt();
        }

        Arrays.sort(cardList);

        int switchPlayer = 0;

        for(int i=n-1;i>=0;i--){
            if(switchPlayer == 0){
                player[0] += cardList[i];
                switchPlayer = 1;
            } else {
                player[1] += cardList[i];
                switchPlayer = 0;
            }
        }

        System.out.println(player[0] - player[1]);


    }

}