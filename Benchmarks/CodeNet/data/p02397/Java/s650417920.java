import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);;
		while(true) {
			int[] array = {scan.nextInt(), scan.nextInt()};
			Arrays.sort(array);
			if(array[0] == 0 && array[1] == 0) {
				break;
			}
			System.out.println(array[0] + " " + array[1]);
		}
		scan.close();
	}
}
