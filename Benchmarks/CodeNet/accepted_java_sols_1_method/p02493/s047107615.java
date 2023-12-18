import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Integer[] suret = new Integer[scn.nextInt()];
		for(int i = 0; i < suret.length; i++) suret[i] = scn.nextInt();
		for(int i = suret.length - 1; i > 0; i--) System.out.print(suret[i] + " ");
		System.out.println(suret[0]);
	}
}