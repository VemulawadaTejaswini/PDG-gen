import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   long a = sc.nextLong();
   long b = sc.nextLong();
   long x = sc.nextLong();
   long low =0;
   long high = b/x +1;
   if(a==0) low=0;
   else low =(a-1)/x +1;
   
   System.out.println(high-low);
 }
}