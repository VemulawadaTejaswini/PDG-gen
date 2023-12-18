import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		long mul=1,com;
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
			mul=mul*arr[i];
		}
	    
		com=(long) Math.pow(10,18);
		if(mul<=com)
			System.out.println(mul);
		else
			System.out.println(-1);
		
		
	}

}
