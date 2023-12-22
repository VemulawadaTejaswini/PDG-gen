import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+i;
		}
		for(int i=0;i<m;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
}