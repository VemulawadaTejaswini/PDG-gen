import java.util.*;
public class Main{
     public static void main(String [] args){
          Scanner sc=new Scanner(System.in);
          int a=sc.nextInt();
          int b=sc.nextInt();
          int c=sc.nextInt();
          int x;
          if(a>=b && b>=c){
               x=a*10+b;
               System.out.print(x+c);
          }
          else if(a>=b&&c>=b&&a>=c){
               x=a*10+c;
               System.out.print(x+b);
          }
          else if(b>=a&&a>=c){
               x=b*10+a;
               System.out.print(x+c);
          }
          else if(b>=a&&c>=a&&b>=c){
               x=b*10+c;
               System.out.print(x+a);
          }
          else if(c>=a&&a>=b){
               x=c*10+a;
               System.out.print(x+b);
          }
          else if(c>=a&&b>=a&&c>=b){
               x=c*10+b;
               System.out.print(x+a);
          }      
     }
}