import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		int animals = scn.nextInt();
		int legs = scn.nextInt();
		if(legs%2==1) {
			System.out.println("No");
		}
		if(animals*2<=legs && animals*4>=legs) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
