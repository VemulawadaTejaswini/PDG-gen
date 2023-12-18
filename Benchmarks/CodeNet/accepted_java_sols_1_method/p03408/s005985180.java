import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   String[] n1 = new String[N];
 
   for(int i=0;i<N;i++) n1[i]= sc.next();
   
   int M = sc.nextInt();
   String[] m1 = new String[M];
 
   for(int i=0;i<M;i++) m1[i]= sc.next();
   int ans =0;
   int count =0;
   for(int i=0;i<N;i++)
   {
     count =0;
     for(int k=0;k<N;k++)
     {
       if(n1[i].equals(n1[k])) count++;
     }
     for(int k=0;k<M;k++)
     {
       if(n1[i].equals(m1[k])) count--;       
     }
     if(ans <count )ans = count;
   }
 
   System.out.println(ans);
 }
}