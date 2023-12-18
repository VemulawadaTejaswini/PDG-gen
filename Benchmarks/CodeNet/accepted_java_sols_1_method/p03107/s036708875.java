
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String S = sc.next();
    int R =0;
    int B =0;
    for(int i=0;i<S.length();i++){
      if(S.substring(i,i+1).equals("0")){
        R++;
      }else{
        B++;
      }
    }
    System.out.println(Math.min(R,B)*2);

  }
    


}
