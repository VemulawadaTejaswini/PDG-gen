import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int [] a = new int [10];
		for(int i = 0;i < 10;i++){
			int N = in.nextInt();
			a[i] = N;
		}
		Arrays.sort(a);
		for(int i = a.length - 1;i > a.length - 4;i--){
			System.out.println(a[i]);
		}
	}
}