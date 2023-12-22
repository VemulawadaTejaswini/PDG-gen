import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		int[] arr=new int[n];
		int[] temp=new int[arr.length];
		int tem,c=0;;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=input.nextInt();
			temp[i]=arr[i];
		}
		input.close();
		Arrays.sort(temp);	
          
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j] != temp[j]) 
			{
				c++;
			}
		
	   }

		if(c<3) 
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}	
		System.exit(0);
		
	}
}
