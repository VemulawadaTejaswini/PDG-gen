import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   int k =kbd.nextInt();
   long a=0;
   for(int i=1;i<=k;i++){
     for(int l=1;l<=k;l++){
       for(int h=1;h<=k;h++){
         int d=gcd(i,l);
         int e=gcd(d,h);
         a=a+e;
       }
     }
   }
  System.out.println(a);
}

   static int gcd (int a, int b) {
     return b>0?gcd(b,a%b):a;
   }
}
