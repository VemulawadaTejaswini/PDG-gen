import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		boolean flg = true;
		for(int i=0;i<N;i++) {
			int x = sc.nextInt();
			if(x%2==0) {
				if(x%3!=0&&x%5!=0) {
					flg = false;
				}
			}
		}
		if(flg) {
			System.out.println("APPROVED");
		} else {
			System.out.println("DENIED");
		}

	}
}