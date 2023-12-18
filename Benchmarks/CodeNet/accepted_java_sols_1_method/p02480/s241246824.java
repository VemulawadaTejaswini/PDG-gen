import java.util.Scanner;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int result=1;
		for(int i=0; i<3; i++){
			result=result*x;
		}
		System.out.println(result);
	}
}