import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String length = s.next();
        String targetNum = s.next();
        String stringValue = s.next();
        int a = Integer.parseInt(targetNum) - 1;
        char[] carVals = stringValue.toCharArray();
        carVals[a] =
                Character.toLowerCase(carVals[a]);
        System.out.println(String.valueOf(carVals));
    }
}
