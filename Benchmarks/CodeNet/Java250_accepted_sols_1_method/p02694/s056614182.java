import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   long x=kbd.nextLong();
   long a=100;
   int y=0;

   while(x>a){
   a=(long)Math.floor(a*1.01);
   y=y+1;
}
System.out.println(y);
 }
}
