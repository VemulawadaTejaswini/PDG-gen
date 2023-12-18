import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      int sum=0;
      String S = sc.next();
      if(S.equals("0")){
        break;
      }else{
        char[] c = S.toCharArray();
        for(int i=0;i<c.length;i++){
          sum += (int)(c[i]-'0');
        }
          System.out.println(sum);
      }
    
    }
  }
}
