import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] a = new int[5];
		
		a[0] = s.nextInt();
		a[1] = s.nextInt();
		a[2] = s.nextInt();
		a[3] = s.nextInt();
		a[4] = s.nextInt();
		
		int k = s.nextInt();
		
		for(int i=0 ; i < 4 ; i++) {
			for(int j = i+1 ; j < 5; j++) {
				if(a[j] - a[i] > k) {
					System.out.println(":(");
					return;
				}
			}
		}
		
		
		System.out.println("Yay!");
		s.close();
		
	}

}