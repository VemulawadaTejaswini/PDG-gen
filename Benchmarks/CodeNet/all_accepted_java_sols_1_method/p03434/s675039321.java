import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i =0 ;i<n;i++)
			arr[i] = s.nextInt();

		Arrays.sort(arr);
		long suma =0 ,sumb =0 ;
		int flag =0 ;
		for(int j = n-1 ;j>=0;j--)
		{
			if(flag ==0 )
			{
				suma+=arr[j];
				flag = 1;
			}
			else
			{
				flag =0 ;
				sumb+=arr[j];
			}
		}
		System.out.println(suma-sumb);
	}
}
