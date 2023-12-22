import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);

        String word1 = scaner.nextLine();
        String word2 = scaner.nextLine();


        if(word1.charAt(0) != word2.charAt(2)){
            System.out.println("NO");
        }else if(word1.charAt(1) != word2.charAt(1)){
            System.out.println("NO");
        }else if(word1.charAt(2) != word2.charAt(0)){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
