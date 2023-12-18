import java.util.Scanner;
 
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int[] h = new int[n];
		int index = 0;
		double abs = Double.MAX_VALUE;
		for(int i = 0; i <n; i++) {
			h[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			double temp =Math.abs(a-(t-(h[i]*0.006)));
			if(temp < abs) {
				abs = temp;
				index = i+1;
			}
		}
		System.out.println(index);
	}
}
