import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      String A = String.valueOf(a);
      String B = String.valueOf(b);
      int i = 0;
      String str_a = "";
      String str_b = "";
      for(i=0;i<b;i++){
        str_a = str_a + A;
      }
      for(i=0;i<a;i++){
        str_b = str_b + B;
      }
      if(a!=b){
        if(a>b){
          System.out.println(str_b);
        }else{
          System.out.println(str_a);
        }
      }else{
        if(str_a.length()>str_b.length()){
          System.out.println(str_b);
        }else{
          System.out.println(str_a);
        }
      }
      
    }
}
