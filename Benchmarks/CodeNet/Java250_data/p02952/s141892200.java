import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Scanner parameter = new Scanner(System.in);

        Integer input1 = parameter.nextInt();

        if (input1 < 10) {

        	System.out.println(input1);
        } else if (input1 >= 10 && input1 < 100) {

        	System.out.println(9);
        } else if (input1 >= 100 && input1 < 1000) {

        	System.out.println(input1 - 90);
        } else if (input1 >= 1000 && input1 < 10000) {

        	System.out.println(909);
        } else if (input1 >= 10000 && input1 < 100000) {

        	System.out.println(input1 - 9090);
        } else {

        	System.out.println(90909);
        }
    }
}
