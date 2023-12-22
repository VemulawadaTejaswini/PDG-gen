

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[] arr = new int[n];
		
		int[] b = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = input.nextInt();
			b[i] = arr[i];
		}
		
		Arrays.sort(b);
		
		int token = 0;
		
		for(int i=0;i<n;i++) {
			if(b[i]!=arr[i])
				token++;
		}
		
		if(token==0 || token==2)
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}

}
