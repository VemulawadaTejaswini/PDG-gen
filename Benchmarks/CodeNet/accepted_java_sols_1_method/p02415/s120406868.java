import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        try(Scanner scanner = new Scanner(System.in);){
            String line = scanner.nextLine();
            String answer = "";
            int length =line.length();

            for(int i=0; i<length; i++){
                char ch = line.charAt(i);
                if(Character.isLowerCase(ch)){
                    ch = Character.toUpperCase(ch);
                }else{
                    ch = Character.toLowerCase(ch);
                }
                answer = String.valueOf(ch);
                System.out.print(answer);
                
            }
            System.out.println();
        }
    }
}
