import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int output = 0;
		for(int i = 0;i<x;i++) {
			int temp = sc.nextInt();
			if(temp>=y)output++;
		}
		System.out.println(output);

	}

}
