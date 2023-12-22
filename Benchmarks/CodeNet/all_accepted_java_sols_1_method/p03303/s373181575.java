import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int w = sc.nextInt();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i += w) {
            builder.append(s.charAt(i));
        }

        System.out.println(builder);
    }
}