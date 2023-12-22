import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char[] input = sc.next().toCharArray();
		Arrays.parallelSort(input);
		if(input[0]==input[1] && input[2]==input[3] && input[1]!=input[2]) System.out.println("Yes");
		else System.out.println("No");
	}
}
