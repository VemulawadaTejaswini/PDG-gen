import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();
		
		int palaceElevations[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			palaceElevations[i] = sc.nextInt();
		}
		
		int ans = 1;
		double bestPalaceTemperature = T - (palaceElevations[0] * 0.006);
		
		for (int i = 0; i < N; i++) {
			double palaceTemperature = T - (palaceElevations[i] * 0.006);
			
			if (Math.abs(A - palaceTemperature) < Math.abs(A - bestPalaceTemperature)) {
				bestPalaceTemperature = palaceTemperature;
				ans = i + 1;
			}
		}
		
		System.out.println(ans);
	}
}
