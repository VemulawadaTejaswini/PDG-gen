import java.util.Scanner;
class Main {
	public void cubic() {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		System.out.println(X*X*X);
	}
	public static void main(String[] args){
	new Main().cubic();
	}
}