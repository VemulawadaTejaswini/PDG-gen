import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int antennaAmounts = 5;
		int[] antennas = new int[antennaAmounts];
		
		for(int i = 0 ; i < antennaAmounts ; i++) {
			antennas[i] = sc.nextInt();
		}
		int inputK = sc.nextInt();
		sc.close();
		
		if(antennas[antennaAmounts-1] - antennas[0] <= inputK) {
			System.out.println("Yay!");
		}else {
			System.out.println(":(");
		}
	}
}