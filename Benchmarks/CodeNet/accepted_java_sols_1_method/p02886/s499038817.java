import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[] arr = new int[input];
		long output = 0;
		for(int i = 0;i<input;i++)arr[i]=sc.nextInt();
		for(int i = 0;i<input;i++) {
			for(int j =i+1;j<input;j++) {
				output += arr[i]*arr[j];
			}
		}
		System.out.println(output);
	}	

}
