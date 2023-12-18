import java.util.Scanner;
class Main{
  public static void main(String[] args){
  Scanner sr = new Scanner(System.in);
  String S = sr.next();
  String T = sr.next();
  if(T.matches("^S"))
    System.out.println("Yes");
  else
    System.out.println("No");
  }
}
