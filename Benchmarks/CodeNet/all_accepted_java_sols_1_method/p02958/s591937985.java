import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner parameter = new Scanner(System.in);

        String[] line1 = parameter.nextLine().split(" ");
        String[] line2 = parameter.nextLine().split(" ");

        Integer count1 = 1;
        Integer count2 = 0;

        for (String nosString : line2) {

        	if (Integer.valueOf(nosString) != count1) {

        		count2 = count2 + 1;
        	}

        	count1 = count1 + 1;
        }

        if (count2 > 2) {

        	System.out.println("NO");
        } else {

        	System.out.println("YES");
        }
    }
}
