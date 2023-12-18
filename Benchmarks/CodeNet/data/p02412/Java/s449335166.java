import java.util.*;
 public class Main{
  public static void main{
   while(true){
    int n = scan.nextInt();
        n>=1;
    int a = scan.nextInt();
         1<= a <=n;
    int b = scan.nextInt();
         b!=a && 1<= b <=n;
    int c = scan.nextInt();
         c!=b && c!=a && 1<=c<=n;
    int x = a+b+c;
    if(n==0 && x==0)break;
    System.out.println(n+" "+x);
   }
 }
}