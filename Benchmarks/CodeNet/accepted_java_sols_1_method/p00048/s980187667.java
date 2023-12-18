import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double x = sc.nextDouble();
			System.out.println(x<=48.00?"light fly":x<=51.00?"fly":x<=54.00?"bantam":x<=57.00?"feather":
                                           x<=60.00?"light":x<=64.00?"light welter":x<=69.00?"welter":
                                           x<=75.00?"light middle":x<=81.00?"middle":x<=91.00?"light heavy":"heavy");
		}
	}
}