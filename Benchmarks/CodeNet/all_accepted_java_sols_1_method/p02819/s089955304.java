import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int x = in.nextInt();

		boolean prime[] = new boolean[2*x+1];
		for(int i=0; i<2*x; i++)
			prime[i] = true;

		for (int p=2; p<=2*x; p++) {
			if(prime[p] == true) {
				if (p >= x) {
					System.out.println(p);
					System.exit(0);
				}
				for(int i = p*2; i<=2*x; i += p)
					prime[i] = false;
			}
		}
	}
}

