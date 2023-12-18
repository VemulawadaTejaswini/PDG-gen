mport java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws Exception{
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	int out[] = new int[num];
	for (int i = num - 1;i >= 0 ;i--) {
		out[i] = scan.nextInt();
	}
	for (int i = 0;i < num - 1;i++) {
		System.out.print(out[i]+ " ");
	}
	System.out.println(out[num-1]);
	}
}