import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int x;
		int y;
		int z;
		x = A % C;
		y = B % D;
		if(x == 0)x = x;
		else x = x + 1;
		if(y == 0)y = y;
		else y = y + 1;
		z = L - x - y;
		System.out.println(z);
		