import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(input.readLine());
	for(int i=0;i<n;i++)
	    {
		int s=Integer.parseInt(input.readLine());
		System.out.println("Case "+(i+1)+":");
		for(int j=0;j<10;j++)
		    {
			s*=s;
			String str=Integer.toString(s);
			String zero="";
			for(int k=0;k<8-str.length();k++)
			    {
				zero+="0";
			    }
			str=zero+str;
			
			String str_ans="";
			for(int k=2;k<=5;k++)
			    {
				str_ans+=str.charAt(k);
			    }
			String str_s="";
			int count=0;
			for(int k=0;k<4;k++)
			    {
				if(str_ans.charAt(k)!='0')
				    {
					str_s+=str_ans.charAt(k);
					count++;
				    }
				else if(str_ans.charAt(k)=='0' && count!=0)
				    {
					str_s+=str_ans.charAt(k);
				    }
			    }
			if(str_s.length()==0)str_s="0";
			System.out.println(Integer.parseInt(str_s));
			s=Integer.parseInt(str_s);
		    }
	    }
    }
}