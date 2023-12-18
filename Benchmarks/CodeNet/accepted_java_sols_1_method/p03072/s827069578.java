import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int h[] = new int[n];

		for(int i = 0; i < h.length; i++) {
			h[i] = sc.nextInt();
		}
		
		int view = 0;
		for(int i = 0; i < h.length; i++) {
			int max = h[i];			
			for(int j = i; j >= 0; j--) {
				if(h[j] > h[i])	max = h[j]; 
			}
			if(max == h[i]) view++;
		}
		System.out.println(view);
		
	}

}
