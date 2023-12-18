import java.util.*;
public class Main {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int d=sc.nextInt();
       int count=0;
       for(int i=0;i<n;i++)
       {
           int x=sc.nextInt();
           int y=sc.nextInt();
           double dis=Math.sqrt((x*x)+(y*y));
           if(dis<=d)
           {
               count++;


           }
       }
       System.out.print(count);
    }
}