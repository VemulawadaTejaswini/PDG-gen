import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int num = scan.nextInt();
        int first = num / 100;
        int last = num % 100;
        
        // search
        String answer = "NA";
        if(last >= 1 && last <= 12 && first >= 1 && first <= 12){
            answer = "AMBIGUOUS";
        } else if (last >= 1 && last <= 12){
            answer = "YYMM";
        } else if (first >= 1 && first <= 12){
            answer = "MMYY";
        }

        // answer
        System.out.println(answer);


    }
}