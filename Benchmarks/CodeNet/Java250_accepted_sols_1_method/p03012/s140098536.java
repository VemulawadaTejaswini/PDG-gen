import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] W = new int[N];
		W[0] = sc.nextInt();
		for(int i=1;i<N;i++) {
			W[i]=W[i-1]+sc.nextInt();
		}
		int min = 100000;
		for(int i=1;i<N-1;i++) {
			int diff = Math.abs((W[N-1]-W[i])-W[i]);
			if(diff<min) {
				min = diff;
			}
		}
		System.out.println(min);
	}
}