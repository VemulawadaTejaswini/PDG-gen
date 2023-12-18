import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long[] al=new long[(int)n];
		long[] al1=new long[(int)n];
		long max,max1=0;	
		for(int i=0;i<n;i++)
		{
			al[i]=sc.nextLong();
			al1[i]=sc.nextLong();
			
		}
		for(int i=0;i<n-1;i++)
		{
			max=((Math.abs(Long.valueOf(al[(int)i]-al[(int)i+1])))+(Math.abs(Long.valueOf(al1[(int)i]-al1[(int)i+1]))));
			max1=Math.max(max, max1);
		}
		System.out.println(max1);
	}

}
