import java.util.*;
class Main
{
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     int x=sc.nextInt();
     int arr[]=new int[x];
     for(int i=0;i<x;i++)
        arr[i]=sc.nextInt();
     int op=sc.nextInt();
     int sum[]=new int[op];
     for(int i=0;i<op;i++)
     {
       int a=sc.nextInt();
       int b=sc.nextInt();
       int add=0;
       for(int j=0;j<x;j++)
       {
         if(a==arr[j])
           arr[j]=b;
         add=add+arr[j];
       }
       sum[i]=add;
     }
     for(int i=0;i<op;i++)
       System.out.println(sum[i]);
   }
}