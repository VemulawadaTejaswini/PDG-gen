import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] t = new int[6];
		for(int i = 0; i < 6; i++) {
			t[i] = sc.nextInt();
		}

		int s = 0;

		s = t[0]*1 + t[1]*5 + t[2]*10 + t[3]*50 + t[4]*100 + t[5]*500;

		if(s>=1000) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}

		sc.close();
	}
}	
