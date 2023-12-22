import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();    
    int cnt =  0;
    int max = 0;
      
    for(int i = 0; i < S.length(); i++){
      if(S.charAt(i) == 'A' || S.charAt(i) == 'C'|| S.charAt(i) == 'G' || S.charAt(i) == 'T'){
        //引数にある文字を返す S.charAt(X);
        cnt++;
      }else{
        cnt=0;
      }
      if(max<cnt){
        max = cnt;
      }
    }
    System.out.println(max);
  }
}