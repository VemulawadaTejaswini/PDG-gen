import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int sum = 0;
		int NUM = 26;
		int charnum = 96;
		char alphabet;

		StringBuilder name = new StringBuilder();

		do {
			switch(N%NUM) {
				case 0:
					alphabet = (char) (charnum+NUM);
					break;
				default:
					alphabet = (char) (charnum+N%NUM);
			}

			String str = String.valueOf(alphabet);
			name.insert(0, str);


			N=N/NUM;
		}while(N/NUM!=0 || N%NUM!=0);

		System.out.println(name);
	}
}

