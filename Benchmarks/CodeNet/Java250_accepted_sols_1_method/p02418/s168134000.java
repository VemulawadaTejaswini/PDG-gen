import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        String p = input.nextLine();
        s += s;

        System.out.println(s.matches(".*" + p + ".*") ? "Yes" : "No");

    }
}