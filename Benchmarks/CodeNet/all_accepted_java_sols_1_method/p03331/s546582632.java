import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); ++i) {
            count += (str.charAt(i) - '0');
        }
        if (count == 1) {
            count = 10;
        }
        System.out.println(count);
    }
}