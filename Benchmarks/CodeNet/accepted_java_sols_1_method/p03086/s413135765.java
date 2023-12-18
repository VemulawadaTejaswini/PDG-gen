import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String val1 = sc.next();

        int count = 0;
        String temp = "";
        for (int i = 0; i < val1.length(); i++) {
            // ACGT
            String target = "" + val1.charAt(i);
            switch (target) {
                case "A":
                case "C":
                case "G":
                case "T":
                    temp = temp + val1.charAt(i);
                    continue;
                default:
                    if (count < temp.length()) {
                        count = temp.length();
                    }
                    temp = "";
            }
        }
        if (count < temp.length()) {
            count = temp.length();
        }
        System.out.println(count);
    }
}