import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			arr[i]=a;
			sum+=a;
		}
		double p=sum/n;
		int min=0;
		int min2=0;
		for(int i=0;i<n;i++)min+=(arr[i]-p)*(arr[i]-p);
		p++;
		for(int i=0;i<n;i++)min2+=(arr[i]-p)*(arr[i]-p);
		if(min<min2)System.out.println(min);
		else System.out.println(min2);
	}
}