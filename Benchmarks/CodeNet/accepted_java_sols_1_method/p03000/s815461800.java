import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner parameter = new Scanner(System.in);

        Integer count = 1;

        String[] input1 = parameter.nextLine().split(" ");
        String[] input2 = parameter.nextLine().split(" ");

        String limit = input1[1];

        Integer total = 0;

        for (int i = 0; i < input2.length; i++) {

        	total = total + Integer.valueOf(input2[i]);

        	if (total <= Integer.valueOf(limit)) {

        		count = count + 1;
        	} else {

        		break;
        	}
        }

        System.out.println(count);
    }
}
