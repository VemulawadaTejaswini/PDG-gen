import java.util.*;

class Main {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		while(true){
			int n = stdIn.nextInt();
			if(n == 0)
				break;

			int[] s = new int[n];
			double sum = 0;

			for (int i=0; i<n; i++) {
				sum += s[i] = stdIn.nextInt();
			}

			double m = sum/n;
			sum = 0;

			for (int i=0; i<n; i++) {
				sum += Math.pow(s[i]-m,2);
			}
			System.out.printf("%.5f\n",Math.pow((double)sum/n,0.5));
		}
	}
}