import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int [] arr = new int [11000];
		long sum = 0;
		int max = -1000001;
		int min =  1000001;

		for(int i = 0;i<num;i++){
			arr[i]=sc.nextInt();
			if(arr[i]<min) min=arr[i];
			if(max<arr[i]) max=arr[i];
			sum = (long)arr[i]+sum;
		}
		
				
			
		
	    System.out.println(min+" "+max+" "+sum);
	}
}