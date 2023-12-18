import java.util.Scanner;
import java.util.LinkedList;

class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		long[] arr;
		n=sc.nextInt();
		arr=new long[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		long min=Integer.MAX_VALUE,sum=0;
		for(long num:arr){
			sum+=num;
			if(num<min)
				min=num;
		}
		System.out.println(sum-min);
	}
}