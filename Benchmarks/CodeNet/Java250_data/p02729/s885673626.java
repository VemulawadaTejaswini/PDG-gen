import java.util.*;
public class Main
 {
     public static void main(String[] args)
   {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int m=s.nextInt();
     int ans=0;
    ans=(n*(n-1)/2)+(m*(m-1)/2);
    System.out.println(ans);
   } 
}