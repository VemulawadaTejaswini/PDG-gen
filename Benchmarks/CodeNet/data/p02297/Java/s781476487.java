import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
	public static void main(String... args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int x[] = new int[n];
		int y[] = new int[n];
		for (int i=0; i<n; i++){
			String numbers[] = br.readLine().split(" ");
			x[i] = Integer.parseInt(numbers[0])-x[0];
			y[i] = Integer.parseInt(numbers[1])-y[0];	
		}
		double area = 0;
		for (int k = 1; k<n-1; k++){
			area += x[k]*y[k+1]-x[k+1]*y[k];
		}
		System.out.printf("%.1f\n", Math.abs(area*0.5));
	}
}