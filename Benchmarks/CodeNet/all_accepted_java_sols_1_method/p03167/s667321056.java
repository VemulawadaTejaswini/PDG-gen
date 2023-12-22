import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

class Main
{
    long ways[][];

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        // System.out.print(V+" "+E);
        Main object=new Main();
        sc.nextLine();
        object.ways=new long[R+1][C+1];
        object.ways[1][1]=1;
        char ch;String str;
        for(int i=0;i<R;i++)
        {
            str=sc.next();
            for(int j=0;j<C;j++)
            {
                 ch=str.charAt(j);
                 if(i==0&&j==0)
                   object.ways[1][1]=1;
                 else if(ch=='.')
                   object.ways[i+1][j+1]=(object.ways[i][j+1]+object.ways[i+1][j])%1000000007;
                 else
                   object.ways[i+1][j+1]=0;
            }
            sc.nextLine();
        }
        System.out.println(object.ways[R][C]);
        sc.close();
     }
}