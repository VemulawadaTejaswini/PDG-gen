import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(),k = scanner.nextInt();
		int[] l = new int[n];
		for(int i=0;i<n;i++){
			l[i] = scanner.nextInt();
		}
		Arrays.sort(l);
		int sum = 0;
		for(int i=(n-1);i>(n-1-k);i--){
			sum += l[i];
		}
		System.out.println(sum);
	}

}
