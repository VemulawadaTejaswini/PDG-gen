import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    String inputString = sc.next();
    char inputChar = inputString.charAt(0);

    for(int i = 0; i < alphabet.length(); i++){
      if( alphabet.charAt(i) == inputChar ){
        System.out.println( alphabet.charAt(i+1) );
        break;
      }
    }
  }
}