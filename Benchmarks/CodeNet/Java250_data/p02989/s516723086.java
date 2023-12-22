import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int[] d = new int[N];
		for(int i=0;i<N;i++) {
			d[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(d);
		if(d[N/2-1]==d[N/2]) {
			System.out.println("0");
		} else {
			System.out.println(d[N/2]-d[N/2-1]);
		}
	}
}