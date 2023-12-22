import java.util.Scanner;
 
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String S = scanner.next();
    String T = scanner.next();
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    String U = scanner.next();
    
    if(S.equals(U)){
      a--;
    }else{
      b--;
    }
    System.out.println(a + " " + b);
    
  }
}