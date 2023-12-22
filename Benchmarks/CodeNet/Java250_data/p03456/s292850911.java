import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int a = sc.nextInt();
   int b = sc.nextInt();
 
   Integer[] sq = new Integer[350];
   int t10 = 1;
   if(b==100) t10=1000;
   else if(b>=10) t10=100;
   else t10=10;
   for(int i=1;i<=350;i++) 
   {
     sq[i-1]=i*i;
   }
   if(Arrays.asList(sq).contains(a*t10+b)) System.out.println("Yes");
   else System.out.println("No");
 }
}