import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int min =1;
		int max =100000;
		for(int i=0;i<M;i++) {
			int L = sc.nextInt();
			int R = sc.nextInt();
			if(L>min) {
				min = L;
			}
			if(R<max) {
				max = R;
			}
		}
		if(max>=min) {
			System.out.println(max-min+1);
		} else {
			System.out.println("0");
		}
	}
}