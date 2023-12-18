
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int[] num = new int[10];
			while(n-->0){
				num[scanner.nextInt()]++;
			}
			for(int a:num){
				if(a==0)
					System.out.println('-');
				else{
					char[] c = new char[a];
					Arrays.fill(c, '*');
					System.out.println(c);
				}
			}
		}
	}
}