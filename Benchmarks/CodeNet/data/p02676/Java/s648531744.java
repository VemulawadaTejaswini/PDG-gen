import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
    int k=kbd.nextInt();
   String s=kbd.next();

   int n=s.length();
   if(n<=k){
     System.out.println(s);
   }else{
     System.out.println(s.substring(0,k)+"...");
   }

 }
}