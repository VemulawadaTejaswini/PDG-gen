import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   long n=kbd.nextLong();
   long a=kbd.nextLong();
   long b=kbd.nextLong();

   if(a==0){
     System.out.println(a);
   }else if(b==0){
     System.out.println(n);
   }else{
   long k=a+b;
   long x;
   if(n%k>a){
     x=a;
   }else{
     x=n%k;
   }
   System.out.println(n/k*a+x);
 }
}
}