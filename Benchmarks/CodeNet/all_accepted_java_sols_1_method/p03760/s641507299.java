import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    String T = sc.nextLine();
    int n = S.length() + T.length();
    
    for(int i = 0; i < n; i++){
      if(i%2 == 0){
        System.out.print(S.charAt(i/2));
      }else{
        System.out.print(T.charAt(i/2));
      }
    }
    System.out.println("");
  }
}