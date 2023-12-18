import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    if(a.equals("SSS")){
      System.out.println(0);
      return;
    }
    if(a.equals("RRR")){
      System.out.println(3);
      return;
    }
    if(a.equals("SRR") | a.equals("RRS") ){
      System.out.println(2);
      return;
    }
    System.out.println(1);
  }
  
}

