import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] spl = s.split(" ");
		int X = Integer.parseInt(spl[0]);
		int A = Integer.parseInt(spl[1]);
		sc.close();

		if(X < A){
			System.out.println("0");
		}else{
			System.out.println("10");
		}
	}
}