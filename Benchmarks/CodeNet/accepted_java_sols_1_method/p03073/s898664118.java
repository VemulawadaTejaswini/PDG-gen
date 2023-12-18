
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String S = sc.next();
    int len = S.length();
    //01010101...とするときに変える枚数xとlen-xのうち小さいほうが答え
    int w=0;
    for(int i=0;i<len;i++){
      if(i%2==0){
        if(S.substring(i,i+1).equals("1")){
          w++;
        }
      }else{
        if(S.substring(i,i+1).equals("0")){
          w++;
        }
      }
    }
    System.out.println(Math.min(w,len-w));

  }
    


}
