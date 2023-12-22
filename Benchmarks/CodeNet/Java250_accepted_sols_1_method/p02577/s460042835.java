import java.io.*;
class Main
{
public static void main(String args[])throws IOException
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int x,sum=0;
    String n=br.readLine();
    for(int i=0;i<n.length();i++)
      sum+=n.charAt(i)-'0';
    if(sum%9==0)
        System.out.println("Yes");
        else
             System.out.println("No");
}
}