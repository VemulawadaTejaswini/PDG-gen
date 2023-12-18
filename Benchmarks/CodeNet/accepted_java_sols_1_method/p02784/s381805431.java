import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=in.nextInt(),s=0;
		int k=in.nextInt();
		int arr[]=new int[k];
		for(int i=0;i<k;i++)
		{
			arr[i]=in.nextInt();
			s=s+arr[i];
		}
		if(s>=n)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}