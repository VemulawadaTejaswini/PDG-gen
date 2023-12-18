import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String x = sc.nextLine();
            if (x.equals("0"))
                break;
            int sum = 0;
            for (int i = 0; i < x.length(); i++) {
                char c = x.charAt(i);
                sum += c - '0';
            }
            System.out.println(sum);
        }
    }
}
