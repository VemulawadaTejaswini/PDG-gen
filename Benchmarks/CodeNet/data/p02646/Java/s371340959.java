import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int a=kbd.nextInt();
   int v=kbd.nextInt();
   int b=kbd.nextInt();
   int w=kbd.nextInt();
   int t=kbd.nextInt();
   long A=a+v*t;
   long B=b+w*t;
   if(a<=b){
   if(A>=B){
      System.out.println("YES");
   }else{
      System.out.println("NO");
   }
 }else if(A<=B){
   System.out.println("YES");
}else{
  System.out.println("NO");
}
}
}
