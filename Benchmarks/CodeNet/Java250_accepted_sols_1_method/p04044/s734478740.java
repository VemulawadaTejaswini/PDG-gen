import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int len = sc.nextInt();
		String dummy = sc.nextLine();

	    String[] array = new String[num];
	    for(int i = 0; i<num; i++){
	        array[i] = sc.nextLine();
	    }

	    Arrays.sort(array);
	    for(int i = 0; i<array.length; i++){
			System.out.print(array[i]);
	    }
	}
}
