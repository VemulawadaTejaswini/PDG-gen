import java.io.*;

class tri
{
public static void main(String args[]) throws NumberFormatException, IOException 
{
int s1,s2,s3;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
s1=Integer.parseInt(br.readLine());
s2=Integer.parseInt(br.readLine());
s3=Integer.parseInt(br.readLine());

if((s1*s1)==(s2*s2)+(s3*s3))
{
}
else if((s2*s2)==(s1*s1)+(s3*s3))
{
}
else if((s3*s3)==(s1*s1)+(s2*s2))
{
}

if(true)
	System.out.println("YES");
else
	System.out.println("NO");
}
} 