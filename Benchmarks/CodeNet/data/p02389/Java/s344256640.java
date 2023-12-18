import java.io.*;
class exe3
{
    public static void main(String args[])throws IOException
    {
	int a,b, menseki,shu;
	BufferedReader input=new BufferedReader(new InputStreamReader (System.in));
	a=Integer.parseInt(input.readLine());
	b=Integer.parseInt(input.readLine());
	menseki=a*b;
	shu=2*a+2*b;
	System.out.println(menseki+" "+shu);
    }
}