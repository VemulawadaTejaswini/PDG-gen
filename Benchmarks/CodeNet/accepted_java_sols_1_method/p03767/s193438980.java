
import java.util.*;
import java.lang.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Integer>a=new ArrayList<Integer>();
    ArrayList<Integer>b=new ArrayList<Integer>();
	Scanner sc=new Scanner(System.in);

	int n=sc.nextInt();
	int i;
	for( i=0;i<3*n;i++)
	{
	a.add(sc.nextInt());	
	}
	Collections.sort(a,Collections.reverseOrder());
	long sum=0,k=1;
	
	for(i=0;i<3*n;i++)
	{
		if(k<=n && i%2!=0)
		{
			sum+=a.get(i);
			k++;
		}
		if(k>n)
			break;
	}
	
	System.out.println(sum);
	
	
	}

}
