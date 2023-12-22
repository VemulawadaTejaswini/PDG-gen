import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.Pattern;

class Main {
    public static void main(String args[])
    {
     int x,y;long tem,sum=0;
     Scanner sc=new Scanner(System.in);
     x=sc.nextInt(); y=sc.nextInt();
     if((x+y)==2)
     {
      sum=300000+300000+400000;
     }
     else if((x+y)==3)
     {
         sum=200000+300000;
     }
     else if(x==2 && y==2)
     {
         sum=200000+200000;
     }
     else if((x==2 && y==3) ||(x==3 && y==2))
     {
         sum=200000+100000;
     }
     else if(x==3 && y==3)
     {
         sum=100000+100000;
     }
     else if((x==3 && y==1) || (x==1 && y==3))
     {
         sum=100000+300000;
     }
     else if((x==1 && y>3)||(x>3 && y==1))
     {
         sum=300000;
     }
     else if((x==2 && y>3)||(x>3 && y==2))
             {
                 sum=200000;
             }
     else if((x==3 && y>3) || (x>3 && y==3))
     {
         sum=100000;
     }
     else if(x>3 && y>3)
     {
         sum=0;
     }
     System.out.println(sum);
    }
}

