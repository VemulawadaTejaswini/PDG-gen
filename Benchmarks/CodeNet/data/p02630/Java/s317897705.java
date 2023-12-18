import java.util.*;
class Main
{
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     int x=sc.nextInt();
     int arr[]=new int[100000];
     int sum=0;
    
     for(int i=0;i<x;i++)
    {
      int temp=sc.nextInt();
        arr[temp]++;
        sum+=temp;
    }
     int op=sc.nextInt();
     int sum2[]=new int[op];
     for(int i=0;i<op;i++)
     {
       int a=sc.nextInt();
       int b=sc.nextInt();
       int add=0;
       if(arr[a]!=0)
       {
          arr[b]+=arr[a];
         
       }
       sum+=(b-a)*arr[a];
        arr[a]=0;
       sum2[i]=sum;
     }
     for(int i=0;i<op;i++)
       System.out.println(sum2[i]);
   }
}