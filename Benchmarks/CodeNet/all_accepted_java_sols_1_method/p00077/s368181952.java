import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.nextLine();
            int i = 0;
            String output = "";
            while (i < input.length()) {
                if (input.charAt(i) == '@') {
                    int r = Integer.parseInt(String.valueOf(input.charAt(i + 1)));
                    for (int n = 1; n < r; n++) {
                        output += input.charAt(i + 2);
                    }
                    i++;
                } else {
                    output += input.charAt(i);
                }
                i++;
            }
            System.out.println(output);
        }
    }
}