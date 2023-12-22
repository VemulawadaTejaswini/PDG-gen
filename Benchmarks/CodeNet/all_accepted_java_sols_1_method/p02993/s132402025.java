import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    char N1 = n.charAt(0);
    char N2 = n.charAt(1);
    char N3 = n.charAt(2);
    char N4 = n.charAt(3);
    if(N1==N2||N2==N3||N3==N4){
      System.out.println("Bad");
    }else{
      System.out.println("Good");
    }
 }
}