import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		sc.close();
		if(N == 100){
			N++;
		}
		for(int a = 0 ; a < D ; a++){
			N = N * 100;
		}
		System.out.println(N);		
	}
}