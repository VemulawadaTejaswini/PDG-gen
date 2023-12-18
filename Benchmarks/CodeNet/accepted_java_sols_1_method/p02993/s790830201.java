import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String n = sc.next();

    if(n.toCharArray()[0]==n.toCharArray()[1] || n.toCharArray()[1]==n.toCharArray()[2] || n.toCharArray()[2]==n.toCharArray()[3]){
      System.out.println("Bad");
    }else{
      System.out.println("Good");
    }

  }
}