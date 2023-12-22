import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        String val2 = sc.next();

        int count = 0;
        String temp = "";
        for (int i = 0; i < val2.length(); i++) {
            temp = temp + val2.charAt(i);
            switch (temp) {
                case "A":
                    continue;
                case "AB":
                    continue;
                case "ABC":
                    count++;
                    temp = "";
                    continue;
                default:
                    temp = "" + temp.charAt(temp.length() - 1);

            }
        }
        System.out.println(count);
    }
}