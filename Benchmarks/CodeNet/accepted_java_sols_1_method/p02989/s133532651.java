
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int nums=sc.nextInt();
		int[] arr=new int[nums];
		for(int i=0;i<nums;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		
		int count=arr[nums/2]-arr[nums/2-1];
		System.out.println(count);
	}
}


//1 4 4 6 7 9
//
//1 4 4 5 5 9 14 14

