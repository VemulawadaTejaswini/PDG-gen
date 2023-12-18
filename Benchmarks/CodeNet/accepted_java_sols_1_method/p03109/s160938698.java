import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    try {
      Scanner sc = new Scanner(System.in);
      String s;
      int num;
      s=sc.next();

      num=Integer.parseInt(s.substring(0,1))*10000000+
      Integer.parseInt(s.substring(1,2))*1000000+
      Integer.parseInt(s.substring(2,3))*100000+
      Integer.parseInt(s.substring(3,4))*10000+
      Integer.parseInt(s.substring(5,6))*1000+
      Integer.parseInt(s.substring(6,7))*100+
      Integer.parseInt(s.substring(8,9))*10+
      Integer.parseInt(s.substring(9,10));

      if(num<=20190430){
        System.out.println("Heisei");
      }else{
        System.out.println("TBD");
      }
      
      }catch (Exception e) {
      System.out.println("out");
    }
  }
}
