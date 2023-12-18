import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] values = new int[n];
		int i = 0;
		while(i < n) {
			values[i] = input.nextInt();
			i++;
		}
		System.out.println(maxLin(n, values));
		
	}
	public static int maxQuad(int n, int[] values) {
		int maxp = -2147000000;
		for(int i = 0; i < n-1; i++) {
			for(int j = i+1; j < n; j++)
				if(values[j]-values[i] > maxp)
					maxp = values[j]-values[i];
		}
		return maxp;
	}
	public static int maxLin(int n, int[] values) {
		int maxp = values[1]-values[0];
		int minv = min(values[1], values[0]);
		for(int i = 2; i < n; i++) {
			maxp = max(maxp, values[i] - minv);
			minv = min(minv, values[i]);
		}
		return maxp;
	}
	public static int min(int a, int b) {
		if(a > b){
			return b;
		}
		if(b > a) {
			return a;
		}
		return a;
	}
	public static int max(int a, int b) {
		if(a > b) {
			return a;
		}
		if(b > a) {
			return b;
		}
		return a;
	}
}
