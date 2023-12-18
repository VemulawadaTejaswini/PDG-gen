import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    int r = sc.nextInt();
    int g = sc.nextInt();
    int b = sc.nextInt();
    int k = sc.nextInt();
    while(g<=r && k>0){
      g=g*2;
      k--;
    }
    while(k>0 && b<=g){
      b=b*2;
      k--;
    }
   // System.out.println(g);
   // System.out.println(b);
    if(g<=r || b<=g){
      System.out.println("No");
    }
    else{
      System.out.println("Yes");
    }
  }
}