import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int Y = sc.nextInt();
   boolean yen =false;
   int z =0;
 
   int ansx=-1;
   int ansy=-1;
   int ansz=-1;
   
   for(int x =0;x<=N;x++)
   {
     for(int y=0;y<=N-x;y++)
     {
       z=N-x-y;
       if(10000*x+5000*y+1000*z==Y)
       {
         ansx=x;
         ansy=y;
         ansz=z;
         yen=true;
         break;
       }
     }
     if(yen) break;
   }
   System.out.println(ansx+" "+ansy+" "+ansz);
 }
}