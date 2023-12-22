
import java.util.*;
public class Main{
	
	void cal()
	{
		Scanner sc=new Scanner(System.in);
		int H,A;
		H=sc.nextInt();
		A=sc.nextInt();
		int i=0;
		while(H>0)
		{
			H=H-A;
			
			i++;
			
		}
		System.out.println(i);
		
		
	}
	
	
	
	
	




public static void main (String args[])
{
	Main obj= new Main();
	obj.cal();

}
}



