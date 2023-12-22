import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		sc.close();
		int a = K/2;
		int b = 0;
		if(K%2==0) {
			b = K/2;
		}else{
			b = K/2 + 1;
		}
		System.out.println(a*b);
	}

}