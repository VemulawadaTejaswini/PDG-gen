import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0 ; i<n ; i++){
			arr[i] = sc.nextInt();
		}
		long num = 0;
		long num2 = 0;
		int count = 1;
		Arrays.sort(arr);
		for(int i=n-1 ; i>=1 ; i--){
			if(arr[i]==arr[i-1]){
				count++;
				if(num==0){
					num = arr[i];
				}
				if(num!=arr[i]){
					num2 = arr[i];
				}
				if(count>=4){
					num2 = arr[i];
				}
			}else{
				continue;
			}
			if(num!=0 && num2!=0){
				break;
			}
			
		}
		
		System.out.println(num*num2);
	}
}