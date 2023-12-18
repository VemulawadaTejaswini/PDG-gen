import java.util.*;

public class Main{
  public static void main(String... arvs){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    long sum=0;
    int i=1;
    while(sum<x){
      sum+=i;
      i++;
    }
    
      System.out.println(i-1);
    
    
  }
}
