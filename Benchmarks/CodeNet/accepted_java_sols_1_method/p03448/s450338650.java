import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int A = sc.nextInt();
   int B = sc.nextInt();
   int C = sc.nextInt();
   int X = sc.nextInt();
   
   int ans =0;
   for(int i=0;i<=A;i++)
   {
     for(int k=0;k<=B;k++)
     {
       for(int j=0;j<=C;j++)
       {
         if(500*i+100*k+50*j==X) ans++;
       }
     }
   }
   
   System.out.println(ans);
 }
}