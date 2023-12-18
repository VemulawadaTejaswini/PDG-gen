import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int k=kbd.nextInt();
   int a=kbd.nextInt();
   int b=kbd.nextInt();
   int x=1;
 for(int i=1;i<=1000;i++){
   if(a<=k*i&&k*i<=b){
     System.out.println("OK");
      x=0;
     break;
   }
 }
  if(x==1){System.out.println("NG");
}}
 }
