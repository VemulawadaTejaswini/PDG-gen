import java.util.Scanner;
import java.util.Arrays;

class Main {
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] input_number = new int[3];
    input_number[0]  = Integer.parseInt(scan.next());
    input_number[1]  = Integer.parseInt(scan.next());
    input_number[2]  = Integer.parseInt(scan.next());
    Arrays.sort(input_number);
    System.out.println(input_number[0] + " " + input_number[1] + " " + input_number[2]);
	}
}

