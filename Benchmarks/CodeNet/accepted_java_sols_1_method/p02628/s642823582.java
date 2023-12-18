import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		int mid=0,s=0,c=0;
		while(mid<=arr.length-1 && c!=k)
		{
			s=s+arr[mid];
			c++;
			mid++;
		}
		System.out.println(s);

	}

}
