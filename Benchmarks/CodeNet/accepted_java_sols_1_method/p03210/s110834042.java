import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    try {
      Scanner sc = new Scanner(System.in);
      int x;
      x=Integer.parseInt(sc.next());

      if(x==7 || x==5 || x==3){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
      
      
      }catch (Exception e) {
      System.out.println("out");
    }
  }
}
