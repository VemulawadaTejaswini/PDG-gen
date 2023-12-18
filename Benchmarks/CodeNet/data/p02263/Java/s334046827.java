import java.util.*;

class Main
{

    //------------stack-------------
    static int[] stack = new int[100];
    static int head=0;

    static void en(int n)
    {
	stack[head]=n;
	head++;
    }

    static int de()
    {
	head--;
	int i=stack[head];
	return i;
    }

    //-----------Main---------------
    public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);
	String s;
	int x, y;
	int i, j, k;

	i=0;
	while(sc.hasNext())
	    {
		//Read number
		if(sc.hasNextInt()==true)
		    {
			en(sc.nextInt());
		    }
		//Read operand
		else
		    {
			s=sc.next();
			//+
			if(s.equals("+")==true)
			    {
				x=de();
				y=de();
				en(y+x);
			    }
		
			//-
			else if(s.equals("-")==true)
			    {
				x=de();
				y=de();
				en(y-x);
			    }
			//*
			else if(s.equals("*")==true)
			    {				
				x=de();
				y=de();
				en(y*x);
			    }
			//else if(s.equals(null)==true)break;
		    }
	    }
    
    
	//print
	System.out.println(stack[0]);
	sc.close();
    
    }

}