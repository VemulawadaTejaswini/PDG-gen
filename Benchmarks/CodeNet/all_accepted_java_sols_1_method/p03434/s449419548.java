import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int N;
		int[] a;

		try(Scanner sc = new Scanner(System.in)){
			N = sc.nextInt();
			a = new int[N];
			for(int i = 0; i < a.length; i++){
				a[i] = sc.nextInt();
			}
		}

		Arrays.sort(a);

		int point = 0;

		for(int i = a.length -1; i >= 0; i-=2){
			point += a[i];
		}
		for(int i = a.length -2; i >= 0; i-=2){
			point -= a[i];
		}

		System.out.println(point);
	}

}
