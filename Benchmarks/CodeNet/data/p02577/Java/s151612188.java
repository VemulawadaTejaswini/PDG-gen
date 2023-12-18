import java.util.*;
import java.io.*;
public class Main {
     public static void main(String[] args) throws java.lang.Exception
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            
            double n = sc.nextDouble();
            double sum=0;
            while(n!=0) {
            	sum=sum+n%10;
            	n=n/10;
            }
            if(sum%9==0) {
            	System.out.print("yes");
            }
            else {
            	System.out.print("no");
            }
            
            
        }
        catch(Exception e){}
        finally{}

	}
}