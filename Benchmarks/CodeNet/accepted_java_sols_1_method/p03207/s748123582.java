import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int[] arr = new int[n+1];
		int max = 100;
		int sum = 0;
		for(int i = 0 ; i<n ; i++){
			arr[i] = Integer.parseInt(scan.nextLine());
			if(arr[i]>max){
				max = arr[i];
			}
			sum += arr[i];
		}
		scan.close();
		System.out.println(sum - max/2);
	}
}