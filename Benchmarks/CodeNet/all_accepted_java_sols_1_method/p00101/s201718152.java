import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(input.readLine());
	for(int i=0;i<n;i++)
	    {
		char a[]=input.readLine().toCharArray();
	    
		for(int j=0;j<a.length-6;j++)
		    {
			if(a[j]=='H' && a[j+1]=='o' && a[j+2]=='s' && a[j+3]=='h' && a[j+4]=='i' && a[j+5]=='n' && a[j+6]=='o')
			    {
				a[j]='H';
				a[j+1]='o';
				a[j+2]='s';
				a[j+3]='h';
				a[j+4]='i';
				a[j+5]='n';
				a[j+6]='a';
			    }
		    }
		System.out.println(String.valueOf(a));
	    }
    }
}