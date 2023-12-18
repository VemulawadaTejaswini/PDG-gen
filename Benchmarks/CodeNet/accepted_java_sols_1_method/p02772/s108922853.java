import java.io.*;
import java.util.*;
public class Main{
   
     public static void main(String []args){
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       long a[]=new long[n];
       for(int i=0;i<n;i++)
       a[i]=s.nextLong();
       boolean flag=true;
       for(int i=0;i<n;i++)
       {if((a[i]%2==0)&&(a[i]%3==0 || a[i]%5==0))
       flag=true;
       else if(a[i]%2==0)
       {flag=false;break;}}
       if(flag)
       System.out.println("APPROVED");
       else
       System.out.println("DENIED");}}