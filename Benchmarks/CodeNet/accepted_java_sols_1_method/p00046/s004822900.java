import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double height = Double.MIN_VALUE,min = Double.MAX_VALUE;
		while(scan.hasNext()) {
			double mount = scan.nextDouble();
			if(height < mount) {
				height = mount;
			}
			if(min > mount) {
				min = mount;
			}
		}
		System.out.println(height - min);
		scan.close();
	}
}
