import java.util.Scanner;

class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		float r = sc.nextFloat();
		int a=22;
		int b=7;
		float circum = (float)2*a*r/b;
		sb.append(circum);
		System.out.print(sb.toString());
	}
}