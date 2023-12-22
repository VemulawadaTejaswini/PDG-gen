import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        int value[][]=new int[s.length()+1][t.length()+1];
        for(int i=1;i<=s.length();i++)
        {
            for(int j=1;j<=t.length();j++)
            {
                if(s.charAt(i-1)==t.charAt(j-1))
                  {
                      value[i][j]=value[i-1][j-1]+1;
                  }
                else 
                {
                    if(value[i][j-1]>value[i-1][j])
                       {
                        value[i][j]=value[i][j-1];
                       }
                    else
                    {
                        value[i][j]=value[i-1][j];
                    }
                }
              //  System.out.print(value[i][j].value+" "+value[i][j].dir+", ");
            }
            //System.out.println("");
        }
        int i=s.length(),j=t.length();
        StringBuilder common=new StringBuilder("");
        while(i>=0&&j>=0&&value[i][j]!=0)
        {
            if(s.charAt(i-1)==t.charAt(j-1))
            {
                common=common.append(s.charAt(i-1));
                 i--;j--;
            }
            else if(value[i][j-1]>value[i-1][j])
            {
                j--;
            }
            else
             {
                 
                 i--;
             }
        }
        System.out.println(common.reverse().toString());
        sc.close();
    }
}