import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    double W = Double.parseDouble(scanner.next());
	    double H = Double.parseDouble(scanner.next());
	    double x = Double.parseDouble(scanner.next());
	    double y = Double.parseDouble(scanner.next());
	    
	    double m = (double)((W * H) / 2);
	    int n = 0;
	    
	    if ((W== 2*x) && (H == 2*y)) {
	    	n=1;
	    }

        System.out.print(m + " " + n);
	}
}