import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int[] list = {sc.nextInt(),sc.nextInt(),sc.nextInt()};

		Arrays.sort(list);

		System.out.printf("%d %d %d\n",list[0],list[1],list[2]);
	}
}
