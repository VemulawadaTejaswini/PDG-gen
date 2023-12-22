import java.util.Scanner;

public class Main {
	
	static int[] antena = new int[5];
	static int dist ;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			antena[i] = Integer.parseInt(sc.nextLine());
		}
		dist = Integer.parseInt(sc.nextLine());
		
		int max = 0;
		
		for(int i=0; i<5; i++) {
			for(int j=4; j>i; j--) {
				if(Math.abs(antena[i] - antena[j]) > max) {
					max = Math.abs(antena[i] - antena[j]);
				}
			}
		}
		
		if(max > dist) {
			System.out.println(":(");
		} else {
			System.out.println("Yay!");
		}

	}
}