import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		int i,j,w;
		int[] a=new int[3];
		Scanner scan = new Scanner(System.in);

	    a[0]= Integer.parseInt(scan.next());
	    a[1]= Integer.parseInt(scan.next());
	    a[2]= Integer.parseInt(scan.next());
	    
	    for(i=0;i<3;i++)
	    {
	    	for(j=i+1;j<3;j++) 
	    	{
	    		if(a[i]>a[j]) {
	    			w=a[i];
	    			a[i]=a[j];
	    			a[j]=w;
	    		}
	    	}
	    
	    }
	    System.out.println(a[0]+" "+a[1]+" "+a[2]);
	}

}