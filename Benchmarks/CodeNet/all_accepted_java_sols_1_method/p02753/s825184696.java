import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    String S = scanner.nextLine();
    
    if(S.charAt(0)==S.charAt(1) && S.charAt(0)==S.charAt(2)){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
    
  }
}

    