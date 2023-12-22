import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer>  ls1 = new ArrayList() ;
		int A = sc.nextInt();
		int B = sc.nextInt();
		int T = (A+B) % 24;
		System.out.println(T);
	}

}
