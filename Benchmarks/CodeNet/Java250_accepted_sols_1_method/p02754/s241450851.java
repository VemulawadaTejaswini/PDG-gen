import java.util.*;
import java.io.*;
public class Main{
  
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long a=sc.nextLong();
        long b=sc.nextLong();
    
            long div=n/(a+b);
            long rem=n%(a+b);
            
            long sum=div*a;
            sum+=Math.min(rem,a);
            System.out.println(sum);


    }
}