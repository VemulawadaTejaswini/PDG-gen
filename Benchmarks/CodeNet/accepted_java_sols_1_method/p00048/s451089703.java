import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()) {
			double a = stdIn.nextDouble();
			if(a <= 48.0) {
				System.out.println("light fly");
			}
			else if(a <= 51.0) {
				System.out.println("fly");
			}
			else if(a <= 54.0) {
				System.out.println("bantam");
			}
			else if(a <= 57.0) {
				System.out.println("feather");
			}
			else if(a <= 60.0) {
				System.out.println("light");
			}
			else if(a <= 64.0) {
				System.out.println("light welter");
			}
			else if(a <= 69.0) {
				System.out.println("welter");
			}
			else if(a <= 75.0) {
				System.out.println("light middle");
			}
			else if(a <= 81.0) {
				System.out.println("middle");
			}
			else if(a <= 91.0) {
				System.out.println("light heavy");
			}
			else {
				System.out.println("heavy");
			}
			
		}
	}
}