import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sin = new Scanner(System.in);
		
		int a, b, ans1, ans2;
		a = sin.nextInt();
		b = sin.nextInt();
		ans1 = a * b;
		ans2 = 2*(a + b);
		System.out.println(ans1 +" "+ ans2);
	}
}
