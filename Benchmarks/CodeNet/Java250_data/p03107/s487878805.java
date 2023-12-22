import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        // input
        String input = scan.next();
        char[] inputChar = input.toCharArray();

        // search
        int countZero = 0;
        int countOne = 0;
        for(int i = 0; i < inputChar.length; i++){
            if(inputChar[i] == '0'){
                countZero++;
            } else {
                countOne++;
            }
        }
        
        // answer
        System.out.println(Math.min(countZero, countOne) * 2);

    }
}