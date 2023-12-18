import java.util.Scanner;

public class Top {

	
	public static void main(String[] args) {
		
		int a[]=new int[10];
		int i,temp,j=0;
		Scanner sca=new Scanner(System.in);
		
		for(i=0;i<10;i++)
		{
			a[i]=sca.nextInt();
			//System.out.println(a[i]);
			
		}
		for(j=0;j<3;j++)
		{
		     for(i=j;i<10;i++)
		        {
			      if(a[j]<a[i])
			        {
				     temp=a[j];
				     a[j]=a[i];
				     a[i]=temp;
			        }
			     
		       }
		    System.out.println(a[j]);
		}
		
	}

}