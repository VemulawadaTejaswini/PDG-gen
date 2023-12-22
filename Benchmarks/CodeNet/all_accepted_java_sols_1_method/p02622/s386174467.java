import java.io.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        char a[]=bu.readLine().toCharArray();
        char b[]=bu.readLine().toCharArray();
        int i,c=0;
        for(i=0;i<a.length;i++)
        if(a[i]!=b[i]) c++;
        System.out.print(c);
    }
}
