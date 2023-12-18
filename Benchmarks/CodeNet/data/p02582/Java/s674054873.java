import java.io.*;
class main 
{
    public static void main(String args[])throws IOException
    {
    int c,i;
    String S;
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    S=br.readLine();
    i=0;c=0;
    while(i<2)
    {
        if(S.charAt(i)=='R')
         {
           c++;        
           if(S.charAt(i)==S.charAt(i+1))
           c++;
           i++;
          }
        i++;
    }
    System.out.println(c);
    }
}