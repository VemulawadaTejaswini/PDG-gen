import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0 ;
		int arr[] = new int[n];
		for(int i = 0; i< n ; i++) {
			arr[i] = scan.nextInt();
		}
		int arr2[] = arr.clone();
		Arrays.sort(arr);
		
		for(int i = 0 ; i < n ; i++) {
			if(arr[i] != arr2[i]) {
				count++;
			}
		}
		//System.out.println(count);
		
		if(count == 0 || count ==2) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}
}
