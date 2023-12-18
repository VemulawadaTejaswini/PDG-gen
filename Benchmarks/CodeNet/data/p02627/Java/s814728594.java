import java.util.Scanner;

class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String test = scan.next();
    char temp = Character.valueOf(test);
    test = test.toLowerCase();
    if (temp.equals(Character.valueOf(test)))
      System.out.print(test);
    else
      System.out.print(temp);
  }
}