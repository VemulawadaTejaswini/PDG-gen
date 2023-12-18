import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    for(int i = 0;i < 3;i++){
      System.out.print(name.charAt(i));
    }
  }
}