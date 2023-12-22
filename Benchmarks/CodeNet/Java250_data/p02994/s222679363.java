import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int L = sc.nextInt();


		int sum = N*(2*L+N-1)/2;

		if(L+N-1<0) {
			System.out.println(sum-(L+N-1));
		} else {
			if(L>0) {
				System.out.println(sum-L);
			} else {
				System.out.println(sum);
			}
		}
	}
}