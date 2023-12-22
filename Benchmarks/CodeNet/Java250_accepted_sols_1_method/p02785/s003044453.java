import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int []array=new int[2];
		int c=0;
		long sum=0;
		int max=0;
		for(int i=0;i<2;i++) {
			array[i]=sc.nextInt();
		}
		int []arr=new int[array[0]];
		for(int i=0;i<array[0];i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>max)
				max=arr[i];
		}
		Arrays.sort(arr);
		if(array[1]>=array[0])
			System.out.println(0);
		else {
			c=array[0]-array[1];
		    for(int i=0;i<c;i++) {
			   sum=sum+arr[i];
		}
		   System.out.println(sum);  
		}
	}
	
}