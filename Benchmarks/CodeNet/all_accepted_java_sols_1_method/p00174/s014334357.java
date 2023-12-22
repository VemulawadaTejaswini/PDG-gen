import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(true)
	    {
		String str=scan.next();
		if(str.equals("0"))break;
		int countA=0,countB=0;
		if(str.charAt(str.length()-1)=='A')
		    {
			countA+=1;
			//countB-=1;
		    }
		else if(str.charAt(str.length()-1)=='B')
		    {
		    countB+=1;
		    //countA-=1;
		    }
		for(int i=1;i<str.length();i++)
		    {
			if(str.charAt(i)=='A')countA+=1;
			else countB+=1;
		    }
		if(str.charAt(str.length()-1)=='B'&&(countB<countA))
		    {
			countB-=1;
			countA+=1;
		    }
		else if(str.charAt(str.length()-1)=='A'&&(countB>countA))
		    {
			countA-=1;
			countB+=1;
		    }
		System.out.println(countA+" "+countB);
	    }
    }
}