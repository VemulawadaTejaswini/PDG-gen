import java.io.*;
class Main 
{
    public static void main(String args[])throws IOException
    {
    int c,i,c1;
    String S;
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    S=br.readLine();
    i=0;c=0;c1=0;
    while(i<3)
    {
       if(S.charAt(i)=='R')
       {c++;c1++;}
       else
       {
         if(c==1)
         c=0;
        }
      i++;
    }
     if(c==0&&c1==1)
       c=c1;
    System.out.println(c);
    }
}