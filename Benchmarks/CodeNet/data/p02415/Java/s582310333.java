
import java.util.Scanner;

public class Mian {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            String line = sc.nextLine();
            String answer = "";
            int length = line.length();
            for (int i=0; i< length; i++){
                char ch = line.charAt(i);
                if(Character.isLowerCase(ch)){
                    Character.toUpperCase(ch);
                }else{
                    Character.toLowerCase(ch);
                }

            }
        }
    }
}

