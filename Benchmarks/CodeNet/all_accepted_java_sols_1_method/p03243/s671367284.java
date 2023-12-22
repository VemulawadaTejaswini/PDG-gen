import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = 0;
		for(int i=N; i<1000; i++) {
			if(i%111==0) {
				a = i;
				break;
			}
		}
		sc.close();
		System.out.println(a);
	}

}