import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
            for(int x = 0; x < word.length(); x++){
                char c = word.charAt(x);
                if(Character.isLetter(c)){
                    if(Character.isLowerCase(c)){
                        System.out.print(Character.toUpperCase(c));
                    }
                    else{
                        System.out.print(Character.toLowerCase(c));
                    }
                }
                else{
                    System.out.print(c);
                }
                if(x == word.length() - 1){
                    System.out.println();
                }
            }
    }
}
