import java.util.Scanner;
class exeid_8_c
{
    public static void main(String args[])
    {
	Scanner input=new Scanner(System.in);
	
	while(input.hasNext())
	    {
		String str=input.next();
		for(int j=0;j<26;j++)
		    {	
			int sum=0;
			for(int i=0;i<str.length();i++)
			    {
				
				
				if((char)('A'+j)==str.charAt(i) || (char)('a'+j)==str.charAt(i))sum++;
				
			    }
			System.out.println((char)('a'+j)+" :"+" "+sum);
		    }
	    }
    }
}