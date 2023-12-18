import java.util.Scanner;

public class Main
{
	static final int MAX = 100005;
	static int arr[] = new int[MAX];
	public static void main(String []args)
	{
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		for(int i = 0; i < n; i++)
		{
			arr[i] = cin.nextInt();
		}
		int q = cin.nextInt();
		for(int i = 0; i < q; i++)
		{
			int a = cin.nextInt();
			binarySearch(0,n,a);
		}
	}
	static void binarySearch(int L,int R,int num)
	{
		while(L < R)
		{
			int mid = L+(R-L)/2;
			if(arr[mid] == num)
			{
				System.out.println("1");
				return;
			}
			else if(arr[mid] > num)
			{
				R = mid;
			}
			else
			{
				L = mid+1;
			}
		}
		System.out.println("0");
	}
}
