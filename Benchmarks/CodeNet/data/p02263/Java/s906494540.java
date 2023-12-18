import java.util.*;

class Main
{

    static int[] stack = new int[100];
    static int head=0;

    static void en(int n)
    {
	stack[head]=n;
	head++;
    }

    static int de()
    {
	int i=stack[head];
	head--;
	return i;
    }
    
    static int size()
    {
	return head;
    }

    public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);
	String s;
	int[] x = new int[2];
	int i, j, k;

	i=0;
	while(sc.hasNext())
	    {
		if(sc.hasNextInt()==true)
		    {
			x[i]=sc.nextInt();
			i++;
			//if(i==1)i=0;
		    }
		else
		    {
			s=sc.next();
			//+
			if(s.equals("+")==true)
			    {
				//System.out.println(x[0]+x[1]+"aaa"+de());
				if(i!=0)
				    {
					en(x[0]+x[1]);
					i=0;
				    }
				else if(i==0)
				    {
					for(j=size(); size()>0; )
					    {
						stack[0]+=de();
					    }
				    }
			    }
			//-
			else if(s.equals("-")==true)
			    {
				if(i!=0)
				    {
					en(x[0]-x[1]);
					i=0;
				    }
				else if(i==0)
				    {
					for(j=size(); size()>0; )
					    {
						stack[0]-=de();
					    }
				    }
			    }
			//*
			else if(s.equals("*")==true)
			    {
				//System.out.println(x[0]+x[1]+"aaa"+de());
				if(i!=0)
				    {
					en(x[0]*x[1]);
					i=0;
				    }
				else if(i==0)
				    {
					for(j=size(); size()>0; )
					    {
						de();
						stack[0]*=de();
					    }
				    }
			    }
			else break;
		    }
	    }

	//print
	System.out.println(stack[0]);
	sc.close();

    }

}