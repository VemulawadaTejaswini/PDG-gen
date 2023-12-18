import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try (Scanner in = new Scanner(System.in)) {
			int[] antena = new int[5];
			for (int i = 0; i < 5; i++) {
				antena[i] = Integer.parseInt(in.next());
			}
			int k = Integer.parseInt(in.next());
			
			for (int i = 0; i < 5; i++) {
				int antena_i = antena[i];
				for (int comp = i; comp < 5; comp++) {
					int dist = antena[comp] - antena_i;
					if (k < dist) {
						System.out.println(":(");
						return;
					}
				}
			}
			System.out.println("Yay!");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
