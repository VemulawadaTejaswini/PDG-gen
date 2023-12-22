import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		List <Integer> H = new ArrayList <Integer> ();
		List <Integer> W = new ArrayList <Integer> ();
		
		int lastH = 0;
		int lastW = 0;
		do {
			lastH = stdIn.nextInt();
			lastW = stdIn.nextInt();
			
			H.add(lastH);
			W.add(lastW);
		} while (lastH != 0 || lastW != 0);
		
		for(int i = 0; i < H.size()-1; i++) {
			for(int j = 0; j < H.get(i); j++) {
				if(j == 0 || j == H.get(i) - 1) {
					for(int k = 0; k < W.get(i); k++) {
						System.out.print("#");
					}
				}
				else {
					System.out.print("#");
					for(int k = 0; k < W.get(i) - 2; k++) {
						System.out.print(".");
					}
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}