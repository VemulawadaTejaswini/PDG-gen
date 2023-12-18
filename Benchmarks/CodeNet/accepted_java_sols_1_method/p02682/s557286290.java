import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), k = sc.nextInt();
		if(k <= a){
			System.out.println(k);
		} else if(k <= a+b){
			System.out.println(a);
		} else {
			System.out.println(a-(k-a-b));
		}
	}
}
