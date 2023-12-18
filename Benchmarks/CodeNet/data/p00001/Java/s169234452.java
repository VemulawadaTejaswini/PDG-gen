import java.util.Scanner;

public class Top {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		int i,temp,j=0;
		Scanner sca=new Scanner(System.in);
		//System.out.println("隸キ霎灘?蜊∽クェ謨ー");
		for(i=0;i<10;i++)
		{
			a[i]=sca.nextInt();
			//System.out.println(a[i]);
			
		}//霎灘?蜊∽クェ謨ー
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