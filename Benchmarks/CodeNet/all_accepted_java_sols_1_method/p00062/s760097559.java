import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	String str;
	while((str=input.readLine())!=null)
	    {
	int a[]=new int[10];
	
	for(int i=0;i<10;i++)
	    {
		a[i]=Integer.parseInt(""+str.charAt(i));
	    }
	int i=0;
	while(true)
	    {
		if(i==9)break;
		for(int j=0;j<9-i;j++)
		    {
			if(j+1==a.length+1)break;
		a[j]=(a[j]+a[j+1])%10;
		
		    }
		
		
		i++;
	    }
	System.out.println(a[0]);
	    }
    }
}