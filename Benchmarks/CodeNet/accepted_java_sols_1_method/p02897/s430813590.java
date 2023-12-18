import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N = sc.nextInt();
		 double ct = 0; 
		for(int a = 1;a<=N;a++) {
			if(a%2==1) {
				ct++;
			}
		}
		System.out.println(ct/N);
	}
}
