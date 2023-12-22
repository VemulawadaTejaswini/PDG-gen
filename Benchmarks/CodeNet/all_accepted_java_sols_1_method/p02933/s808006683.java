import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

    	Scanner parameter = new Scanner(System.in);

    	String[] line1 = parameter.nextLine().split(" ");
        String[] line2 = parameter.nextLine().split(" ");

        int S = Integer.parseInt(line1[0]);

        if (S >= 3200) {

        	System.out.println(line2[0]);
        } else {

        	System.out.println("red");
        }
    }
}
