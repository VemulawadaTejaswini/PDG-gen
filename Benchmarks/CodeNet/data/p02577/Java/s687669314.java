import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] chars = s.toCharArray();

        int sum = 0;
        for (int i = 0; i <chars.length; i++) {
            sum += Character.getNumericValue(chars[i]);
        }

        if (sum % 9 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }



    }
}