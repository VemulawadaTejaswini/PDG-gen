import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int n  = input.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++){
			arr[i] = input.nextInt();
		}
		int sum = 0;
		for(int i = 0; i < arr.length;i++){
			sum +=arr[i];
		}
		if (num - sum >= 0)
			System.out.println(num - sum);
		else
			System.out.println("-1");
		
	}
}