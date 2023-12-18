import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   long[] a= new long[5];
   char[] c;
   for(int i=0;i<N;i++)
   {
     c = sc.next().toCharArray();
     if(c[0]=='M') a[0]++;
     else if(c[0]=='A') a[1]++;
     else if(c[0]=='R') a[2]++;
     else if(c[0]=='C') a[3]++;
     else if(c[0]=='H') a[4]++;
   }

   long sum = 0;
   
   for(int i=0;i<3;i++)
   {
     for(int k=i+1;k<4;k++)
     {
       for(int j=k+1;j<5;j++)
       {
         sum+= a[i]*a[k]*a[j];
       }
     }
   }
   System.out.println(sum);
 }
}