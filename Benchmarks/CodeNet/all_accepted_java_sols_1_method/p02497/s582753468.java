import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

	    char rank;
	    while(true)
	    {
	    	int m = sc.nextInt();
	    	int f = sc.nextInt();
	    	int r = sc.nextInt();
	        if(m==-1 && f==-1 && r==-1)
	            break;
	         
	        if(m==-1 || f==-1)rank='F';
	        else if(m+f >= 80)rank='A';
	        else if(m+f >= 65)rank='B';
	        else if(m+f >= 50)rank='C';
	        else if(m+f >= 30)rank='D';
	        else rank='F';
	         
	        if(rank=='D' && r >= 50)
	            rank='C';
	         
	        System.out.println(rank);
	    }

	}
}