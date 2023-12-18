import java.io.*;
class Main 
{
    public static void main(String args[])throws IOException
    {
    int c,i;
    String S;
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    S=br.readLine();
    i=0;c=0;
    while(i<3)
    {
        if(S.charAt(i)=='R')
         {
           c++; 
           if(i==2)
           break;       
           if(S.charAt(i)==S.charAt(i+1)){
           c++;
           i++;
           if(i==2)
           break;
           if(S.charAt(i)==S.charAt(i+1))
           c++;
          }}
        i++;
    }
    System.out.println(c);
    }
}