import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    boolean A = false;
    boolean B = true;
    int C = 0;
    for(int i = 0; i < S.length(); i++){
      if(i == 0){
        if(S.charAt(i) == 'A'){
          A = true;
        }
      }else if(i == 1 || i == S.length()-1){
        if(S.charAt(i) >= 'A' && S.charAt(i) <= 'Z'){
          B = false;
        }
      }else{
        if(S.charAt(i) == 'C'){
          C++;
        }else{
          if(S.charAt(i) >= 'A' && S.charAt(i) <= 'Z'){
            B = false;
          }
        }
      }
    }
    System.out.println((A && B && C==1) ? "AC" : "WA");
  }
}