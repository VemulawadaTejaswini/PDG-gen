import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i=0;
		try (Scanner scn = new Scanner(System.in)) {
			while(true) {
				i++;
				if(scn.nextInt() == 0) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}
