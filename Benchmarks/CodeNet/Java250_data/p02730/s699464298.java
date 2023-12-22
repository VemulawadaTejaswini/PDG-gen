
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        strong_palindrome(scn.next());
    }
    static  void  strong_palindrome(String word){

        if(palindrome(word) != word){
            System.out.println("No");
            return;
        }
        String fp = word.substring(0, (word.length()-1)/2);
        String sp = word.substring((word.length()-1)/2+1);
        if(palindrome(fp) != fp || palindrome(sp) != sp){
            System.out.println("No");
            return;
        }
        System.out.println("Yes");

    }
    static String palindrome(String word){
        for(int i = word.length()-1; i >= 0; i--){
            if(word.charAt(i) != word.charAt(word.length()-1-i)){
                return "";
            }
        }
        return  word;
    }

}
