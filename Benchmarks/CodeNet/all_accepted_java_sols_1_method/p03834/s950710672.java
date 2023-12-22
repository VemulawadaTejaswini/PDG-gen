import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] input =sc.nextLine().split(",");
    for(String w : input){
      System.out.print(w + " ");
    }
  }
}