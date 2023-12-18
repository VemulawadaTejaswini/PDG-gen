import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int count=0;
		while(n-->0)
		{
			int i=0;
			arr[i]=sc.nextInt();
			arr[i+1]=sc.nextInt();
			if(arr[i]==arr[i+1])
			{
				count++;
				if(count>=3)
				{
					continue;
				}
			}
			else
			{
				count=0;
			}
			
			i++;
			
			
		}
		if(count>=3)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}
