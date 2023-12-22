import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int X = sc.nextInt();
   boolean br = true;
   
   while(br)
   {
     br=false;
     for(int i=2;i<=Math.sqrt(X);i++)
     {
       if(X%i==0)
       {
         br=true;
         break;
       }
     }     
     X++;
   }
   X--;
   System.out.println(X);
 }
}