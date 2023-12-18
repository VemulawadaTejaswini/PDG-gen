import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = scan.nextInt();
		}
		int count = 0;
		boolean flag = true;
		int i = 0;
		while(flag){
			flag = false;
			for(int j = n-1; j <= i+1; j--){
				if(arr[j] < arr[j-1]){
					int big = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = big;
					count++;
					flag = true;
				}
			}
			i++;
		}
		for(int j = 0; j < n; i++){
			System.out.printf(j != n-1? "%d " : "%d\n", arr[j]);
		}
	}
}