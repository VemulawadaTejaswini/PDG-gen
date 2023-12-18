import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String input = new java.util.Scanner(System.in).nextLine();
		String[] input2 = input.split(" ");
		int a = Integer.parseInt(input2[0]);
		int b = Integer.parseInt(input2[1]);
		int c = Integer.parseInt(input2[2]);
		int[] s = new int[3];
		s[0] = a;
		s[1] = b;
		s[2] = c;
		Arrays.sort(s);
		System.out.println(s[0] + " " +  s[1] + " " + s[2]);
	}
}