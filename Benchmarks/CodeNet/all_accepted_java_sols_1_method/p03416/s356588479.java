import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int A = sc.nextInt();
   int B = sc.nextInt();
   
   int ans =0;
   int tmp10000=0;
   int tmp1000=0;
   int tmp100=0;
   int tmp10=0;
   int tmp1=0;
   int tmp;
   for(int i=A;i<=B;i++) 
   {
     tmp =i;
     tmp1=tmp%10;
     tmp= (tmp-tmp1)/10;
     tmp10=tmp%10;
     tmp= (tmp-tmp10)/10;
     tmp100=tmp%10;
     tmp= (tmp-tmp100)/10;
     tmp1000=tmp%10;
     tmp= (tmp-tmp1000)/10;
     tmp10000=tmp%10;
     
     if(tmp1==tmp10000&&tmp10==tmp1000) ans++;
   } 

   System.out.println(ans);
 }
}