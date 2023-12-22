import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
   int[] t = new int[N];
   int[] x = new int[N];
   int[] y = new int[N];
   for(int i=0;i<N;i++)
   {
     t[i] = sc.nextInt();
     x[i] = sc.nextInt();
     y[i] = sc.nextInt();
   }

   int tmpd =0;
   int tmpt =0;
   int tmpx =0;
   int tmpy =0;
   boolean cant = false;
   for(int i=0;i<N;i++) 
   {
     tmpd = Math.abs(tmpx-x[i])+Math.abs(tmpy-y[i]);
     if(tmpd>t[i]-tmpt)
     {
       cant = true;
       break;
     }
     else if((t[i]-tmpt-tmpd)%2==1)
     {
       cant = true;
       break;
     }
     tmpt=t[i];
     tmpx=x[i];
     tmpy=y[i];
   }
   String ans = "Yes";
   if(cant) ans = "No";
   System.out.println(ans);
 }
}