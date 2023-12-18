import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;
 
 
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        // TODO ?????????????????????????????????????????????
        int i,j,n,q,a;
        a=0;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        int s[]=new int [n];
        for(i=0;i<n;i++)
        {
            s[i]=scan.nextInt();
        }
        q=scan.nextInt();
        int t[]=new int [q];
        for(j=0;j<q;j++)
        {
            t[j]=scan.nextInt();
        }
        for(j=0;j<q;j++)
        {
            for(i=0;i<n;i++)
            {
                if(t[j]==s[i])
                {
                    a++;
                    break;
                }
            }
        }
        System.out.println(a);
    }
 
}