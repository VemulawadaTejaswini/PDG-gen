import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        Integer input = scan.nextInt();
 
        if(input == 1) {
        	System.out.println(1);
        } else {
        	int passKindCount = input * input * input;
        	System.out.println(passKindCount);
        }
        scan.close();
	}

}
