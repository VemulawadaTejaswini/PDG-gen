import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
      
		Scanner sc = new Scanner (System.in);
		int monster = sc.nextInt();
		int times = sc.nextInt();
		long physical[] = new long[monster];
		long sumPhysical = 0;

		for(int i=0 ; i<monster ; i++) {
			physical[i] = sc.nextInt();
		}

		Arrays.sort(physical);

		for(int i=0 ; i<monster-times ; i++) {
			sumPhysical += physical[i];
		}

		System.out.println(sumPhysical);
		sc.close();
	}
}