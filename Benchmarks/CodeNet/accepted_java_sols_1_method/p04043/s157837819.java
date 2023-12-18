import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int[] abc = new int[3];
      int five =0;
      int seven = 0;
      String ans = "NO";
      for(int i=0;i<3;i++){
        abc[i] = sc.nextInt();
        if(abc[i]==5){
          five++;
        }else if(abc[i]==7){
          seven++;
        }
      }
      if(five==2&&seven==1){
        ans = "YES";
      }
      System.out.println(ans);
    }
}
