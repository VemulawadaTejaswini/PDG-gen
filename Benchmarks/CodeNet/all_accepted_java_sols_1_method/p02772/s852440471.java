import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        
        int[] a= new int[n];
        
        for(int i=0;i<n;i++)
        {
            int x;
            x=sc.nextInt();
            a[i]=x;
        }
        
        int flag=1;
        
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0 )
            {
                if(a[i]%3==0 || a[i]%5==0)
                {
                    flag=1;

                }
                
                else
                {
                    flag=0;
                    break;
                }
            }
        }
        
        if(flag==0)
        {
            System.out.println("DENIED");
        }
        
        else{
            System.out.println("APPROVED");
        }
    
    }
    
    
    
}

