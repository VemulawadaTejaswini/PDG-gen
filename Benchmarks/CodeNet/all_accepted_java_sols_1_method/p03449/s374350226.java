import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] n1 = new int[N];
   for(int i=0;i<N;i++) n1[i]= sc.nextInt();
   
   int[] n2 = new int[N];
   for(int i=0;i<N;i++) n2[i]= sc.nextInt();
  
   int sum =0;
   
   for(int i=0;i<N;i++)
   {
     sum+= n1[i]+n2[i];
   }
   
   int tmp = sum;
   int ans = 0;
   int minussumtmp=0;
   
   for(int i=0;i<N;i++)
   {
     tmp =sum;
     minussumtmp =0;
     for(int k=0;k<i;k++)
     {
        minussumtmp+=n2[k];
     }
     for(int k=i+1;k<N;k++)
     {
        minussumtmp+=n1[k];       
     }
     if(ans <sum - minussumtmp) ans = sum - minussumtmp;
   }
   System.out.println(ans);
 }
}