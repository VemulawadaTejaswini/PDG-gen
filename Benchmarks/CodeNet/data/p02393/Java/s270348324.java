import java.util.Arrays;
import java.util.Scanner;

public class SortingThreeNumbers {
	public static void main (String[] args) throws java.lang.Exception
	 {
		Scanner scan = new Scanner(System.in);



		int [] su  = new int[3];
		su[0] = scan.nextInt();
		su[1] = scan.nextInt();
		su[2] = scan.nextInt();
		Arrays.sort(su);
		System.out.println(Arrays.toString(su));
		scan.close();
	 }

}
