import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        String str1 = c.nextLine();
        String str2 = c.nextLine();
        int count = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (!str1.substring(i, i + 1).equals(str2.substring(i, i + 1))) {
                count++;
            }
        }

        System.out.println(count);

    }

}