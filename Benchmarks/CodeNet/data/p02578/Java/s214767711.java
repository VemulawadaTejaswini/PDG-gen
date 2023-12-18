import java.util.Scanner;

public class Main {
	static int N;
	static int count;
	static int max=0;
	public static void main(String args[]) {
		try(Scanner sc = new Scanner(System.in)){
			N = Integer.parseInt(sc.next());
			int a[] = new int[N+1]; 
			for(int i=0;i<N;i++) {
				a[i] = Integer.parseInt(sc.next());
			}
			for(int i=0;i<N;i++) {
				max = Math.max(max, a[i]);
				if(max>a[i]) {					
					int j = max;				
					count += j-a[i];
				}
				
			}
			System.out.println(count);
		}
	}
}
