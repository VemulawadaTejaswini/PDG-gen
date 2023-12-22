import java.util.*;
  public class Main{
    public static void main(String[]args){
      Scanner scn = new Scanner(System.in);
      int a = scn.nextInt();
      int b = scn.nextInt();
      
      if((a+b)%2==0){
        System.out.println((a+b)/2);
      }else {
        System.out.println("IMPOSSIBLE");
      }
    }
  }