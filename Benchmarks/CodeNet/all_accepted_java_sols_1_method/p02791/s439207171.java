import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] a = new int[N];
		for(int i=0 ; i<N ;i++) {
			a[i] = stdIn.nextInt();
		}
		int count = 1;
		int min = a[0];
		for(int i=1 ; i<N ; i++) {
			if(a[i] > min) {
				
			}else {
				count++;
				min = a[i];
			}
		}
		System.out.println(count);
	}
}
