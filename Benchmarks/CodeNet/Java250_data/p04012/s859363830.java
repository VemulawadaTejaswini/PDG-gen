import java.util.Scanner;
import java.util.Arrays;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    scanner.close();

    char[] inputChars = new char[input.length()];
    for(int i=0; i<input.length(); i++){
      inputChars[i] = input.charAt(i);
    }

    Arrays.sort(inputChars);

    if(inputChars.length == 1){
      System.out.println("No");
    }

    for(int i=1; i<inputChars.length; i++){
      if(inputChars[i-1]!=inputChars[i] && i%2==1){
        System.out.println("No");
        break;
      }
      if(i == inputChars.length-1){
        System.out.println("Yes");
        break;
      }
    }
  }
}
