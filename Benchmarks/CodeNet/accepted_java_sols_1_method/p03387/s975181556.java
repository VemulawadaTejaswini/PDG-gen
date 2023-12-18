import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int[] arr = new int[3];
		int ans = 0;
		arr[0] = input.nextInt();
		arr[1] = input.nextInt();
		arr[2] = input.nextInt();
		Arrays.sort(arr);
		int D1 = arr[2]-arr[0];
		int D2 = arr[2]-arr[1];
		if (D1%2!=D2%2) {
			ans++; //Increment largest by 1 and number with odd difference by 1
			if (D1%2==1) D1++;
			else D2++;
		}else if (D1%2==1&&D2%2==1) {
			ans++;
			D1--;
			D2--;
		} 
		ans+=D1/2;
		ans+=D2/2;
		System.out.println(ans);
	}	
}