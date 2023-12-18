import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            String sentence = sc.nextLine();

            if (sentence.equals(".")) {
                break;
            }

            char[] str = new char[100];
            str = sentence.toCharArray();

            char[] cutStr = new char[100];
            int count = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (str[i] == '[' || str[i] == ']' || str[i] == '(' || str[i] == ')') {
                    cutStr[count] = str[i];
                    count++;
                }
            }

            String answer = new String(cutStr);
            answer = answer.trim();
            for (int i = 0; i < 50; i++) {
                answer = answer.replace("()", "");
                answer = answer.replace("[]", "");
            }

            if (answer.equals("")) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }

        sc.close();
    }

}
