import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] spl = s.split(" ");
		int A = Integer.parseInt(spl[0]);
		int B = Integer.parseInt(spl[1]);
		sc.close();
		if(A < 6){
			B = 0;
		}else if(A >= 6 && A < 13){
			B = B / 2;
		}
		System.out.println(B);
	}

}