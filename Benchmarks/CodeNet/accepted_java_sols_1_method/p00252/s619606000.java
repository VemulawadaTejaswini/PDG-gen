import java.io.*;
class Main
{
public static void main(String args[])throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

String n=input.readLine();
if(n.equals("1 0 0"))System.out.println("Close");
else if(n.equals("0 1 0"))System.out.println("Close");
else if(n.equals("1 1 0"))System.out.println("Open");
else if(n.equals("0 0 1"))System.out.println("Open");
else if(n.equals("0 0 0"))System.out.println("Close");

}
}