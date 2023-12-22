import java.lang.reflect.Array;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0;i<N;i++)arr[i] = sc.nextInt();
		int output = 0;
		int temp = 0;
		int var = arr[0];
		for(int i = 1;i<N;i++) {
			if(var>=arr[i]) {
				temp++;
			}
			else {
				
				if(output<=temp) {
					output = temp;
				}
				temp =0;
			}
			var = arr[i];
		}
		if(output < temp)output = temp;
		System.out.println(output);

	}
	

}
