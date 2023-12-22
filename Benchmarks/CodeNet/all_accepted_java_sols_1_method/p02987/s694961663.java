import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        char[] input = scan.next().toCharArray();

        // search
        char temp1 = input[0];
        char temp2 ='t';
        int count = 1;
        String answer = "Yes";
        for(int i = 1; i < input.length; i++){
            if(temp1 != input[i] && count == 1){
                temp2 = input[i];
                count++;
            } else if(count == 2 && temp1 != input[i] && temp2 != input[i]){
                answer = "No";
            }
        }
        if(count == 1){
            answer = "No";
        }

        // answer
        System.out.println(answer);

    }
}