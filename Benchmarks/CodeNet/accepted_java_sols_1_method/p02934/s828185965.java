import java.text.NumberFormat;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

    	Scanner parameter = new Scanner(System.in);

    	String[] line1 = parameter.nextLine().split(" ");
        String[] line2 = parameter.nextLine().split(" ");

        int[] intNumber = new int[line2.length];

        for (int i = 0; i < line2.length; i++) {

        	intNumber[i] = Integer.parseInt(line2[i]);
        }

        double sumNumber = 0;

        for (int nowNumber : intNumber) {

        	sumNumber = sumNumber + Double.valueOf(1) / nowNumber;
        }

        double lastNumber = Double.valueOf(1) / sumNumber;

        System.out.println(lastNumber);
    }
}
