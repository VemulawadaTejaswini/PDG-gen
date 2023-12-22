import java.util.Scanner;

class Main {
	public static void main(String[] argv){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		System.out.println((c>a?(c>b?(b>a?"Yes":"No"):"No"):"No"));
	}
}