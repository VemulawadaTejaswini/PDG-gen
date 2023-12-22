import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int L = sc.nextInt();
   int R = sc.nextInt();
   boolean zero = false; 
   
   if(L-R>=2019) zero = true;
   for(int i = L;i<R;i++)
   {
     if(i%2019==0) 
     {
       zero = true;
       break;
     }
   }
   L = L%2019;
   R = R%2019;
   int min = 2017*2018;
   if(!zero)
   {
     for(int i = L;i<R;i++)
     {
       for(int k = i+1;k<=R;k++)
       {
          if(min>(i*k)%2019) min = (i*k)%2019;         
       }
     }
   }
   if(zero) System.out.println(0);
   else System.out.println(min);
 }
}