import java.util.Arrays;
import java.io.*;

public class Main{
    public static void  main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cards = Integer.parseInt(br.readLine());
        int[] card = new int[cards];
        String  input = br.readLine();

        for(int i = 0; i<cards-1; i++){
            card[i] = Integer.parseInt(input.substring(0,input.indexOf(" ")));
            input = input.substring(input.indexOf(" ")+1);
        }
        card[cards-1] = Integer.parseInt(input);
        Arrays.sort(card);

        int Bob = 0;
        int Alice = 0;
        boolean isAliceTurn = cards%2 == 1;

        for(int a_card : card){
            if(isAliceTurn){
                Alice += a_card;
                isAliceTurn = false;
            }
            else{
                Bob += a_card;
                isAliceTurn = true;
            }
        }
    System.out.println(Alice - Bob);
    }
}