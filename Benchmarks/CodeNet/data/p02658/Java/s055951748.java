import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			long[] kazu = new long[n];
			long jyo =1;
			for(int i = 0; i < n; i++) {
				kazu[i] = sc.nextLong();
				jyo *= kazu[i];
				if(jyo > 1000000000000000000L) {
					System.out.println("-1");
					break;
				}
			}
			if(jyo <= 1000000000000000000L) {
				System.out.println(jyo);

			}
	}

}
