import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String S = sc.nextLine();
    int win = 0;
    for(int i = 0; i < S.length(); i++){
      if(S.charAt(i) == 'o'){
        win++;
      }
    }
    
    win += 15 - S.length();
    
    System.out.println(win >= 8 ? "YES" : "NO");
  }
}