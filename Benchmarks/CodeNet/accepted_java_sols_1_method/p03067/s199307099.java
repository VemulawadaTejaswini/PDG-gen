import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] spl = s.split(" ");
		int A = Integer.parseInt(spl[0]);
		int B = Integer.parseInt(spl[1]);
		int C = Integer.parseInt(spl[2]);
		
		if(((A > C)&&(B < C))||((A < C)&&(B > C))){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}