import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while (true) {
			int n = stdIn.nextInt();
			int x = stdIn.nextInt();
			if((n+x) == 0)
				break;

			int count = 0;

			for (int i=1; i<=n-2; i++) {
				for (int j=i+1; j<=n-1; j++) {
					for (int k=j+1; k<=n; k++) {
						if((i+j+k) == x && i!=j && j!=k && k!=i)
							count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}