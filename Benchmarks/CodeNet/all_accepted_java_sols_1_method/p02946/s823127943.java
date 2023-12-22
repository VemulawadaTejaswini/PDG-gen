import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		int X = sc.nextInt();
		sc.close();
		for(int i=X-K+1;i<X+K;i++) {
			if(i!=X+K-1) {
				System.out.print(i+" ");
			} else {
				System.out.print(i);
				System.out.println();
			}
		}
	}
}