import java.util.Scanner;
import java.lang.Math;
public class Main{
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	while (scan.hasNext()) {
	    String input = scan.nextLine();
	    String[] inputs = input.split(" ");
	    int height = Integer.parseInt(inputs[0]);
	    int width = Integer.parseInt(inputs[1]);
	    if (height == 0 && width == 0) {
		break;
	    }
	    for (int i = 0; i < height; i++) {
		for (int j = 0; j < width; j++) {
		    System.out.print("#");
		}
		System.out.println();
	    }
	    System.out.println();
	}
    }
}