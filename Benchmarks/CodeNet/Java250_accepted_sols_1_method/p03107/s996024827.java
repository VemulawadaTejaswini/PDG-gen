import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String S = sc.nextLine();
    char c = S.charAt(0);
    int count = 1;
    int ans = 0;
    for(int i = 1; i < S.length(); i++){
      if(count == 0){
        c = S.charAt(i);
        count++;
      }else if(c == S.charAt(i)){
        count++;
      }else{
        count--;
        ans += 2;
      }
    }
    System.out.println(ans);
  }
}