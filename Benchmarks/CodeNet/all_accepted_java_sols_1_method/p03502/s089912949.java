import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N =sc.nextInt();
		int L =0;
		int O =0;
		int P =0;
		P = N;
		
		for(int X=1; X<=9; X++){
			L =N%10;
			O += L;
			N = N/10;
		}
		if(P%O==0){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}