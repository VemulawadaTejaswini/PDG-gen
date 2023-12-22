import java.io.*;
import java.util.*;
public class Main{
   
     public static void main(String []args){
       Scanner s=new Scanner(System.in);
       long a[]=new long [3];
       for(int i=0;i<3;i++)
       a[i]=s.nextLong();
       Arrays.sort(a);
       boolean flag=false;
       for(int i=0;i<2;i++)
       {if(a[i]==a[i+1])
       {flag=true;
       break;}}
       if(a[0]==a[1] && a[1]==a[2])
       flag=false;
       if(flag)
       System.out.println("Yes");
       else
       System.out.println("No");}}