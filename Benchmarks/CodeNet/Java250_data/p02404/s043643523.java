import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
	  int l,w;
	  boolean t=true;
	  Scanner in=new Scanner(System.in);
	  
	  while(t)
      { l=in.nextInt();
	    w=in.nextInt();
		
		if(l==0 && w==0)
		{       
			break;
		}
		
        for(int i=0;i<l;i++)
        {
		    for(int j=0;j<w;j++)
		    {
				if(i==0 || i==l-1 || j==0 || j==w-1)
			      System.out.print("#");
			    else
				  System.out.print(".");
		    }
		    System.out.println("");
	    }
		System.out.println("");
		
	  }		
	  

    
  }

}