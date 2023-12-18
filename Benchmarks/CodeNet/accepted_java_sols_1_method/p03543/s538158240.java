import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//A
		int N = sc.nextInt();
		String N_S = String.valueOf(N);
		char N1,N2,N3,N4;
		N1 = N_S.charAt(0);
		N2 = N_S.charAt(1);
		N3 = N_S.charAt(2);
		N4 = N_S.charAt(3);
		if((N1==N2&&N1==N3)||(N2==N4&&N3==N4))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
