import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] ar)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		String s = br.readLine();
		int len=s.length();
		if(s.equals("AtCo"))
			out.println("AC");
		else{
		if(s.charAt(0)=='A')
		{
			int count=0,f=0,pos=0;
			for(int i=2;i<=len-2;i++)
			{
				if(s.charAt(i)=='C')
				{
					count++;
					pos=i;
				}
			}
			if(count==1)
			{
				for(int i=1;i<len;i++)
				{
					if(i==pos)continue;
					if(s.charAt(i)<97 || s.charAt(i)>122)
					{
						f=1;
						break;
					}
				}
				if(f==1)
					out.println("WA");
				else
					out.println("AC");
			}
			else
			{
				out.println("WA");
			}

		}
		else
		{
			out.println("WA");
		}
		
      	
      }
      out.flush();
    }
}