import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int wa,tuginoSaidai,hozon;
		wa = 0;
		final int KOSU = N;
		int[] kakaku = new int[KOSU];
		int[] narabi = new int[KOSU]; 
		for (int i=0;i<KOSU;i++) {
			kakaku[i] = sc.nextInt();
		}
		Arrays.sort(kakaku);
		for(int i=0;i<K;i++) {
			wa = wa +kakaku[i];
		}
		System.out.println(wa);
		sc.close();
	}

}