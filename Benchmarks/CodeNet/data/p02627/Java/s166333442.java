import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    String ans = "a";
    if(s.matches("[A-Z]")) {
    	ans = "A";
    }
    
    System.out.println(ans);
  }
}
