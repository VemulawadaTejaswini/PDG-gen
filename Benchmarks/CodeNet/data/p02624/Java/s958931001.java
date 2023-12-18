
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int count = 0;
		long sum = 0;

		for(int i=1;i<N+1;i++) {
			for(int j=1;j<i+1;j++) {
				if(i%j==0) {
					count++;
				}
			}
			sum = i*count+sum;
            count=0;
		}
		System.out.println(sum);
	}
}