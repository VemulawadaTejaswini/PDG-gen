import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		if((X*2<=Y)&&(Y<=X*4)&&(Y%2==0)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}

}