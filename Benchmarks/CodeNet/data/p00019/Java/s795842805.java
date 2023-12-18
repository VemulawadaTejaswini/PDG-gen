import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 1;
		while(n > 0){
			x = x * n;
			n--;
		}
		System.out.println(x);
	}
}