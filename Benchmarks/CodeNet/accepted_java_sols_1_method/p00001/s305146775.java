import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static Scanner scan;

	public static void main(String a[]){
		scan = new Scanner(System.in);
		int[] list = new int[10];
		for(int i=0;i<10;i++){
			list[i]=scan.nextInt();
		}
		Arrays.sort(list);

		for(int i=9;i>6;i--){
			System.out.println(list[i]);
		}

	}
}

