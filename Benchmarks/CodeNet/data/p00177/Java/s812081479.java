import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			double n_1 = sc.nextDouble();
			double e_1 = sc.nextDouble();
			double n_2 = sc.nextDouble();
			double e_2 = sc.nextDouble();
			
			if(n_1 == -1 && e_1 == -1 && n_2 == -1 && e_2 == -1){
				break;
			}
			
			System.out.println((int)((6378.1 * Math.acos((Math.cos((90 - n_1) / 180 * Math.PI) * 
			Math.cos((90 - n_2) / 180 * Math.PI) + 
			Math.sin((90 - n_1) / 180 * Math.PI) * 
			Math.sin((90 - n_2) / 180 * Math.PI) *
			Math.cos((e_2 - e_1) / 180 * Math.PI))) + 0.5)));
		}
	}
}