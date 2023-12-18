import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
	  int n=0;
	  Scanner in=new Scanner(System.in);
	  n=in.nextInt();

	  for(int i=1;i<=n;i++)
	  {
		  if(i %3==0)
			  System.out.print(" "+i);
		  if(i>10 && i%10==3)
			  System.out.print(" "+i);
		  
	  }
System.out.println("");
  }

}