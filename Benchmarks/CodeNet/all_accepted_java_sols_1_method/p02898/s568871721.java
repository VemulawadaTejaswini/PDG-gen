import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int ninzu = scanner.nextInt();
	    int height = scanner.nextInt();

	    int ok = 0;
	    for (int i=0; i<ninzu; i++) {
	    	int height_temp = scanner.nextInt();
	    	if (height_temp >= height) ok++;
	    }

	    System.out.println(ok);
	}

}
