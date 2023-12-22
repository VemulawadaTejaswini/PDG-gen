import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        String[] stepList = word.split("");
        boolean isGood = true;

        for (int i = 0; i < stepList.length; i++) {
            if (i % 2 == 0) {
                if (stepList[i].equals("L")) {
                    isGood = false;
                }
            } else {

                if (stepList[i].equals("R")) {
                    isGood = false;
                }

            }
            if (!isGood) {
                break;
            }
        }

        String result = "";
        if (isGood) {
            result = "Yes";
        } else {
            result = "No";
        }

        System.out.println(result);
    }
}
