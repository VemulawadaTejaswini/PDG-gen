import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int X = sc.nextInt();
   
   int ans =0;
   if(X>=2000) ans =1;
   else
   {
   for(int a=0;a<=20;a++)
   {
     for(int b=0;b<=20-a;b++)
     {
       for(int c=0;c<=20-a-b;c++)
       {
         for(int d=0;d<=20-a-b-c;d++)
         {
           for(int e=0;e<=20-a-b-c-d;e++)
           {
             for(int f=0;f<=20-a-b-c-d-e;f++)
             {
                if(100*a+101*b+102*c+103*d+104*e+105*f==X)
                {
                  ans =1;
                  break;
                }
             } 
           }
         }
       }
     }
   }
   }
   System.out.println(ans);
 }
}