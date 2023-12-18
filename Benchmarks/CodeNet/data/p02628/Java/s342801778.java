import java.util.*;
import java.io.*;
class Main{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 int c=sc.nextInt();
	 int n=sc.nextInt();
	 int sum=0;
	 int i,j;
	 ArrayList<Integer> arl = new ArrayList<Integer>();
	 for(i=0;i<c;i++)
	 {
	 	arl.add(sc.nextInt());
	 }
	 Collections.sort(arl);

	
	for(j=0;j<n;j++)
	{
		sum+=arl.get(j);
	}
	System.out.println(sum);
	
				
		
	}
}