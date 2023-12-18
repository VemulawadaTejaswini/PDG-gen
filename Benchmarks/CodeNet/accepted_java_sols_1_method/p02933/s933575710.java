import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String S = sc.nextLine();
    
    System.out.println(N >= 3200 ? S : "red");
  }
}