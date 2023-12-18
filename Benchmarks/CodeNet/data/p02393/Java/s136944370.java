import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int[] arr = new int[]{a,b,c};
		Arrays.sort(arr);
		for(int i = 0;i < arr.length;i++)
			System.out.print(arr[i] + " ");

}
}