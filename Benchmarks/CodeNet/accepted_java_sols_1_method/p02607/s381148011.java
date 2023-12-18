import java.io.IOException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] card=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			card[i] = sc.nextInt();
		}
		for(int i=0;i<n;i+=2) {
			if(card[i]%2==1) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}