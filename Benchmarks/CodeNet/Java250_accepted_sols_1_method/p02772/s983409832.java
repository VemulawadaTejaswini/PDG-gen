import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int c=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
			if(arr[i]%2==0 && c==0)
			{
				if(arr[i]%3!=0 && arr[i]%5!=0)
				{
					System.out.println("DENIED");
					c=1;
				}
			}
		}
		if(c==0)
		{
		System.out.println("APPROVED");
		}
	}
}