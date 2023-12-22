import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char[] data = str.toCharArray();


    if (data[0]==data[1]||data[1]==data[2]||data[2]==data[3]) {
      System.out.println("Bad");
    } else {
      System.out.println("Good");
    }


  }
}
