import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int s = S.length();
    int a = -1, z = 0;
    for(int i = 0; i < s; i++){
      if(S.charAt(i) == 'A' && a == -1){
        a = i;
      }else if(S.charAt(i) == 'Z'){
        z = i;
      }
    }
    System.out.println(z-a+1);
  }
}