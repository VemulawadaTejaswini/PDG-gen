import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ary = sc.nextLine().split(" ");
		Arrays.parallelSort(ary);
		System.out.println(Integer.parseInt(ary[2]+ary[1]) + Integer.parseInt(ary[0]));
	}
}