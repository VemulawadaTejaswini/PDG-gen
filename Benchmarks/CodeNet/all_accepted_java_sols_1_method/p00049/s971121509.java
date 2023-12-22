import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	String str;
	int a[]=new int[4];
	while((str=input.readLine())!=null)
	    {
		String str_ary[]=str.split(",");
		
		if(str_ary[1].equals("A"))a[0]++;
		if(str_ary[1].equals("B"))a[1]++;
		if(str_ary[1].equals("AB"))a[2]++;
		if(str_ary[1].equals("O"))a[3]++;
		
	    }
	for(int i=0;i<4;i++)
	    {
		System.out.println(a[i]);
	    }
    }
}