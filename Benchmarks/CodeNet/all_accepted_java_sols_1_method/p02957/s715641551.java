import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner parameter = new Scanner(System.in);

        String[] input = parameter.nextLine().split(" ");

        Integer parameter1 = Integer.valueOf(input[0]);
        Integer parameter2 = Integer.valueOf(input[1]);

        if ((parameter1 + parameter2) % 2 == 0) {

        	System.out.println((parameter1 + parameter2) / 2);
        } else {

        	System.out.println("IMPOSSIBLE");
        }
    }
}
