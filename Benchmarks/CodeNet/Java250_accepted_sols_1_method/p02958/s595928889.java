import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] target = new int[n];
		int[] sample = new int[n];
		for(int i=0;i<n;i++) {
			int input=sc.nextInt();
			target[i]=input;
			sample[i]=input;
		}
		Arrays.sort(sample);
		int count=0;
		for(int i=0;i<n;i++) {
			if(target[i]!=sample[i]) {
				count++;
			}
		}
		
		System.out.println(count<=2? "YES": "NO");
	}
}
