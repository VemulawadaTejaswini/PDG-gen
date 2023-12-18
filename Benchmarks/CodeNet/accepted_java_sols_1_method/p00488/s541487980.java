import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] pasta = new int[3];
		int[] juice = new int[2];
		int low_p = 2001, low_j = 2001;
		for(int i=0; i<pasta.length; i++) {
			pasta[i] = sc.nextInt();
			if(low_p > pasta[i]) {
				low_p = pasta[i];
			}
		}
		for(int i=0; i<juice.length; i++) {
			juice[i] = sc.nextInt();
			if(low_j > juice[i]) {
				low_j = juice[i];
			}
		}
		System.out.println(low_p+low_j-50);
	}
}