
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] array = new int[4];
		for(int i = 0; i < 4; i++) array[i] = sc.nextInt();
		System.out.println(Math.min(array[0], array[1]) + Math.min(array[2], array[3]));
	}
}
