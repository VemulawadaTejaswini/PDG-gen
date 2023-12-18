import java.util.Scanner;

public class Main {
	
	public static int[] reconstruct(int a, int withB, int[] arr) {
		int sum = 0;
		for (int count = 0; count < arr.length; count++) {
			if(arr[count] == a) {
				arr[count] = withB;
			}
			sum += arr[count];
		}
		System.out.println(sum);
		return arr;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int[] arr = new int[t];
		for (int count = 0; count < arr.length; count++) {
			arr[count] = scan.nextInt();
		}
		
		int toDo = scan.nextInt();
		for (int count = 0; count < toDo; count++) {
			int a = scan.nextInt(); int b = scan.nextInt();
			arr = reconstruct(a, b, arr);
		}
		scan.close();
	}

}
