import java.io.*;
import java.util.*;
public class Main{
   
     public static void main(String []args){
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int a[]=new int[n];
       int min=101,max=0;
       for(int i=0;i<n;i++)
       {a[i]=s.nextInt();
       min=Math.min(min,a[i]);
       max=Math.max(max,a[i]);
       }
       int minans=Integer.MAX_VALUE;
       for(int i=min;i<=max;i++)
       {int ca=0;
       for(int j=0;j<n;j++)
       {ca+=(a[j]-i)*(a[j]-i);}
       minans=Math.min(minans,ca);
       }
       System.out.println(minans);
     }}