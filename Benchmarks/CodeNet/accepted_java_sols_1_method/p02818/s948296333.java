import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long a,b,k;
    a=scan.nextLong();
    b=scan.nextLong();
    k=scan.nextLong();
    if(a>=k){
      long temp = a-k;
      System.out.println(temp + " " + b);
    }else if(a+b>=k){
      long temp = a+b-k;
      System.out.println("0 "+ temp);
    }else{
      System.out.println("0 0");
    }
  }
}