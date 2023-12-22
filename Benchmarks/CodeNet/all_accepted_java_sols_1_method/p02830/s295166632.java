import java.util.Scanner;
import java.io.*;
public class Main

{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String st="";
        int n=sc.nextInt();
        String s=sc.next();
        String t=sc.next();
        for(int i=0;i<n;i++)
        {
            st=st+s.charAt(i)+t.charAt(i);
        }
        System.out.println(st);
        
        
    }
}