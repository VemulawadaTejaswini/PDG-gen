import java.util.Scanner;
 
class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String test = scan.next();
    char temp = test.charAt(0);
    test = test.toLowerCase();
    if (temp.equals(test.charAt(0)))
      System.out.print(test);
    else
      System.out.print(temp);
  }
}