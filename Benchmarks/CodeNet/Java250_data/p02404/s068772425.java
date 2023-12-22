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
	    printsharp(width);
	    for (int i = 0; i < height - 2; i++) {
		System.out.print("#");
		for (int j = 0; j < width - 2; j++) {
		    System.out.print(".");
		}
		System.out.println("#");
	    }
	    printsharp(width);
	    System.out.println();
	}
    }
    public static void printsharp(int width) {
	for (int i = 0; i < width; i++) {
	    System.out.print("#");
	}
	System.out.println();
    }
}