import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] abc= {sc.nextInt(),sc.nextInt(),sc.nextInt()};
		int k=sc.nextInt();
		Arrays.sort(abc);
		for(int i=0; i<k;i++) abc[2] *= 2;
		System.out.println(abc[0]+abc[1]+abc[2]);
	}
}
