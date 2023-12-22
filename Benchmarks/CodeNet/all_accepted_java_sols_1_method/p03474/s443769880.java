import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int A = Integer.parseInt(S[0]);
    int B = Integer.parseInt(S[1]);
    String T = sc.nextLine();
    
    System.out.println(T.matches("[0-9]{"+A+"}-[0-9]{"+B+"}") ? "Yes" : "No");
  }
}