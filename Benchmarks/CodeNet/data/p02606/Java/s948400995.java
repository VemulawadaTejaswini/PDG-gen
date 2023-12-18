import java.util.*;
public class Main{
  	public static void main(String[] args){
      Scanner sc =new Scanner(System.in);
     
      int L=sc.nextInt();
      int R=sc.nextInt();
      int d=sc.nextInt();
      
      int a=(L-1)/d;
      int b=R/d;
      int c=b-a

      System.out.println(c);
    }
}