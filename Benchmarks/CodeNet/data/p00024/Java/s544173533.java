import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double min_v;
		try {
			while (true) {
				int n = 0;
				min_v = scn.nextFloat();
				for(int i = 0;i<min_v*min_v/98+1;i++){
					n++;
				}
				System.out.println(n);
			}
		} catch (Exception e) {
		}
	}
}