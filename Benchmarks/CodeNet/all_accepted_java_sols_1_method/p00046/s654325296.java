import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		double mountain = 0;
		double max =0;
		double min= 1000000;

		while (stdin.hasNext()){
			mountain = stdin.nextDouble();
			if(max < mountain) {
				max = mountain;
			} if (min > mountain) {
				min = mountain;
			}
		}
		System.out.println(max - min);

	}

}