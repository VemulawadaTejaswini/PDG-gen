import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] defargs) {
        Scanner scanner = new Scanner(System.in);
    int[] integer = new int[3];
		for(int i = 0; i < 3; i++) 
		    integer[i] = scanner.nextInt();
	        Arrays.sort(integer);
		    System.out.println(integer[0] + " " + integer[1] + " " + integer[2]);
    }
}

