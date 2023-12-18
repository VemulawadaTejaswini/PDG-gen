import java.util.Scanner;
class Cubic {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int equal = (int) Math.pow(X, 3);
		System.out.print(equal);
	}
}