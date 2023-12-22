import java.util.*;
public class Main {
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int nums = sc.nextInt();
		long[] arr = new long[2];
		long[] sticks = new long[nums];
		for (int i= 0; i < nums; i++)
			sticks[i]=sc.nextInt();
		Arrays.sort(sticks);
		int count = 0;
		//for (int i = nums - 1; i >= 1; i--)
		while(-- nums >= 1)
		{
			if (sticks[nums]==sticks[nums-1])
			{
				arr[count]= sticks[nums];
				nums--;
				count++;
			}
			if (count==2)
				break;
		}
			System.out.println(arr[0]*arr[1]);
		
	}
	
	
	
}
