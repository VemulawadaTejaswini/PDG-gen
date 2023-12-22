import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
BufferedReader input=new BufferedReader (new InputStreamReader (System.in));
    while(true)
        {
         
        int sum=0;
        String str=input.readLine();
        if(str.equals("0"))break;
        for(int i=0;i<str.length();i++)
            {
             
            sum+=str.charAt(i)-'0';
            }
        System.out.println(sum);
        }
    }
}