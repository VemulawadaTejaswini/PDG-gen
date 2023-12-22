import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] num = new int[n];
		int[] numSorted = new int[n];
		int count = 0;
		
		for(int i =0;i<n;i++) {
			num[i] = input.nextInt();
		}
		
		for(int i =0;i<n;i++) {
			numSorted[i]= num[i];
		}
		Arrays.sort(numSorted);
		for(int i =0;i<n;i++) {
			if(num[i]!=numSorted[i]) {count++;}
			
		}
		if(count==0||count==2)
		System.out.println("YES");
		else {
			System.out.println("NO");
		}
			
			
		
		}

	}


