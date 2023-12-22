import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int[] antennas = new int[5];
        for(int i = 0; i < 5; i++){
            antennas[i] = scan.nextInt();
        }
        int k = scan.nextInt();

        // search
        String answer = "Yay!";
        for(int i = 0; i < 4; i++){
            for(int j = i + 1; j < 5; j++){
                if(antennas[j] - antennas[i] > k){
                    answer = ":(";
                }
            }
        }
        
        // answer
        System.out.println(answer);


    }
}