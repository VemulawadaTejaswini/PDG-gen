
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(final String[] args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int length = string.length();
        String answer = "";
        for(int i = 0; i < length; i++){
            char ch = string.charAt(i);
            if(Character.isUpperCase(ch)){
                ch = Character.toLowerCase(ch);
            }else if(Character.isLowerCase(ch)){
                ch = Character.toUpperCase(ch);
            }
            answer = answer.concat(String.valueOf(ch));
        }
        System.out.println(answer);
        scanner.close();
    }
     
    

}
