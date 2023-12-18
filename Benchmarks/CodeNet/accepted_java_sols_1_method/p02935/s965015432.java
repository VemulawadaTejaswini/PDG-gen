import java.util.*;
public class Main {

	public static void main(String[] ble){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		double res = arr[0] + arr[1];
		res /= 2;
		for(int i = 2; i < n; i++){
			res += arr[i];
			res /= 2;
		}
		System.out.println(res);
	}
}
