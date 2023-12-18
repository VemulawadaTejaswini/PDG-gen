import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     long x = sc.nextLong();
     long t = sc.nextLong();
     if(x>=t){
       System.out.println(x-t);
     }else{
       System.out.println(0);
     }
 }
}
