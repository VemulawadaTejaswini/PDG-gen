import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String ans = "Three";
      for(int i=0;i<n;i++){
        if(sc.next().equals("Y")){
          ans = "Four";
          break;
        }
      }
      System.out.println(ans);
    }
}
