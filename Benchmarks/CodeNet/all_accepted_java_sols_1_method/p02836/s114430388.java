import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        char[] input = scan.next().toCharArray();


        // search
        int answer = input.length / 2;
        for(int i = 0; i < Math.ceil(input.length / 2); i++){
            if(input[i] == input[input.length - 1 - i]){
                answer--;
            } 
        }

        // answer
        System.out.println(answer);

    }
}