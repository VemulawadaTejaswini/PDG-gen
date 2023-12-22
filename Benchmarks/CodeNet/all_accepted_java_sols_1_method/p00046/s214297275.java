import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner stdin = new Scanner(System.in);
		String data = null;
		double hight = stdin.nextDouble();;
		double max = hight;
		double min = hight;
		while(stdin.hasNext()) {

			hight = stdin.nextDouble();
			
			if(max < hight) {
				max = hight;
			}
			
			if(min > hight) {
				min = hight;
			}
			
		}
		
		System.out.println(max - min);
	}
}