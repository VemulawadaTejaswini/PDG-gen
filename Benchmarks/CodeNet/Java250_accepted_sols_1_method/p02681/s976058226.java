import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    
    String S = stdIn.next();
    String T = stdIn.next();
    
    int count = 0;
    for(int i = 0;i < S.length();i++){
      if(S.charAt(i) == T.charAt(i)){
        count++;
      }
      else
        break;
    }
    
    if(count == S.length() && S.length() + 1 == T.length())
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}

      
    