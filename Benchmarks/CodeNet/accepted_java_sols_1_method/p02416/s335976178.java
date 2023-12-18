import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            if (s.equals("0")) {
                break;
            }

            int len = s.length();
            int sum = 0;
            for (int i = 0; i < len; i++) {
                sum += s.charAt(i) - '0';
            }
            System.out.println(sum);
        }

    }

}
