import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int x=kbd.nextInt();
   int y=kbd.nextInt();

   int Y=y/4;//Max tsuru
   boolean a=false;
   for(int i=Y;i>=0;i--){
     if(y==(x-i)*2+i*4){
       a=true;
     }
   }
   if(a==true){
     System.out.println("Yes");
   }else{
     System.out.println("No");
   }
 }
}
