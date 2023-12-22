import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt(),k = sc.nextInt(),result = 0;
		int[] l = new int[n];
		for(int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}
		Arrays.sort(l);
		for(int i= n-1; i>n-k-1 ; i--) {
			result +=l[i];
		}
		System.out.print(result);
		

	}

}
