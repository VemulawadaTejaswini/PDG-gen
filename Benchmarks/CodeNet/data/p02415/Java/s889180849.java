import java.util.Scanner;
import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String input = s.nextLine();
    s.close();
    String[] inputAry = input.split("");
    for (int i = 0; i < inputAry.length; i++) {
      if (Character.isLetter(inputAry[i].charAt(0))) {
        if (Character.isUpperCase(inputAry[i].charAt(0)))
          inputAry[i] = inputAry[i].toLowerCase();
        else
          inputAry[i] = inputAry[i].toUpperCase();
      }
    }
    String result = String.join("", inputAry);
    System.out.println(result);
  }
}

