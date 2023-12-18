import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int day = sc.nextInt();
		final int ko = sc.nextInt();
		final int sa = sc.nextInt();
		final int ko_d = sc.nextInt();
		final int sa_d = sc.nextInt();
		
		final int day_ko = (int) Math.ceil(ko / (double)(ko_d));
		final int day_sa = (int) Math.ceil(sa / (double)(sa_d));
		
		System.out.println(day - (Math.max(day_ko, day_sa)));
		
	}

}