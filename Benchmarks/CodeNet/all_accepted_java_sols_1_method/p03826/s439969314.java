import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int AB, CD;
		AB = A*B;
		CD = C*D;
		if(AB > CD){
			System.out.print(AB);
		}else{
			System.out.print(CD);			
		}
		sc.close();
	} 
}