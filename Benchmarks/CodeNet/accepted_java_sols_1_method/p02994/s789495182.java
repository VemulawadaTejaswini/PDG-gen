import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int l=sc.nextInt();
		int[] apple = new int[n];
		for(int i=0;i<n;i++) {
			apple[i]=l+i;
		}
		Arrays.parallelSort(apple);
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=apple[i];
		}
		int min=Integer.MAX_VALUE;
		int index=0;
		for(int i=0;i<n;i++) {
			int temp=Math.abs(apple[i]);
			if(min>temp) { min=temp; index=i;}
		}
		System.out.println(sum-apple[index]);
	}
}
