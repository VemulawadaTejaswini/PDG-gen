import java.util.Scanner;
 public class Main{
   public static void main(String[]args){
     Scanner s = new Scanner(System.in);
     int n = s.nextInt();
     int a = n/2;
     int b = (n/2)+1;
     double c = a;
     double d = b;
     
     if(n%2==0){
       System.out.println(c/n);
     }else if(n%2!=0){
       System.out.println(d/n);
     }
   }
 }