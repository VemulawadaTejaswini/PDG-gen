import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), L = sc.nextInt();
		String[] array = new String[N];
		String buff="";
		for(int i=0;i<N;i++) {
			array[i] = sc.next();
		}
		Arrays.sort(array);
		for(int i=0;i<N;i++) {
			buff+=array[i];
		}

		System.out.println(buff);//Yes or YES注意

	}
	public static int sample(int n) {
		return n;
	}

}
