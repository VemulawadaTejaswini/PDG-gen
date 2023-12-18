import java.util.Scanner;
public class Main {
  public static void main (String[]args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int counter = 0;
    if(s.substring(0,1).equals("1")){counter++;}
    if(s.substring(1,2).equals("1")){counter++;}
    if(s.substring(2,3).equals("1")){counter++;}
    System.out.println(counter);
  }
}
