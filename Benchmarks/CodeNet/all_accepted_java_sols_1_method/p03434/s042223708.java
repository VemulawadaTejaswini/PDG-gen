import java.util.*;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();

		int array[] = new int[n];

		for(int i = 0; i<n;i++){
			array[i] = sc.nextInt();
		}

		Arrays.sort(array);

		int array2[] = new int[n];

		for(int i=0;i<n;i++){
			array2[i] = array[n-i-1];
		}

		int a = 0;

		for(int i=0; i<n;i += 2){
			a += array2[i];
		}
		
		int b = 0;

		for(int i=1; i <n; i+=2){
			b += array2[i];
		}
		System.out.println(a-b);

		
	}
}

