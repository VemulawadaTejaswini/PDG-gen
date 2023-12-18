import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	String str=input.readLine();
	int m=0,n=str.length()-1;
	char ch[]=str.toCharArray();
	String str1;
	while(true)
	    {
		
		if((m==n) || (m>n))
		    {
			str1=String.valueOf(ch);
			break;
		    }
		
		
		char tmp=ch[m];
		ch[m]=ch[n];
		ch[n]=tmp;
		m++;
		n--;

	    }
	
		System.out.println(str1);
	    
    }
}