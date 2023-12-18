import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final int DATA_SIZE = 10;
		int height;
		int first=-1,second=-1,third=-1;
		for(int i=0; i<DATA_SIZE; i++) {
			height = scanner.nextInt();
			if(height>first) {
				third = second;
				second = first;
				first = height;
			} else if(height>second) {
				third = second;
				second = height;
			} else if(height>third) {
				third = height;
			}
		}
		
		System.out.printf("%d\n%d\n%d\n",first, second, third);
	}

}