import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<n; i++) {
			int p = in.nextInt();
			if(p<=min) {
				min=p;
				count++;
				//System.out.println(p);
			}
			
		}
		System.out.println(count);
	}
}
