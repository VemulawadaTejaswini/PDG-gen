import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double min_v;
		int n = 0;
		try {
			while (true) {
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