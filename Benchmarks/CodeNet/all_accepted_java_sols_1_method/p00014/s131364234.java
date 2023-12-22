import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int n = in.nextInt();
			int sum=0;
			for(int i=n;i<600;i+=n) {
				sum = sum+i*i*n;
			}
			System.out.println(sum);
		}
		in.close();
	}
}
