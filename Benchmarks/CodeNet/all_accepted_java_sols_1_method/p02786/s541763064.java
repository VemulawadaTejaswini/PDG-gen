import java.util.*;
public class Main {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     
   long n = sc.nextLong();
   long count =1;
   long sum=0;
 
 while(n>0){
     sum+=count;
     count*=2;
     n/=2;
 }
     
 System.out.println(sum);
    }
}