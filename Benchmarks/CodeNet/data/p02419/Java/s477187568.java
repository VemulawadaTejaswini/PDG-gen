import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String W = sc.next();

        StringBuilder Wt = new StringBuilder();
        for (String s : W.split("")) {
            Wt.append(Character.toLowerCase(s.charAt(0)));
        }

        int sum = 0;
        while (true) {
            String T = sc.next();
            if ("END_OF_TEXT".equals(T)) break;

            StringBuilder tmp = new StringBuilder();
            for(String s : T.split("")) {
                if (Character.isLetter(s.charAt(0))) tmp.append(Character.toLowerCase(s.charAt(0)));
            }

            if (tmp.toString().equals(Wt.toString())) sum++;
        }
        System.out.println(sum);
    }
}