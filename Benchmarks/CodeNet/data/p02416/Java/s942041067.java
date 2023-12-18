import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        int sum;
        int i;
        while (true) {
            input = sc.nextLine();
            if (input.equals("0")) break;
            sum = 0;
            for (i = 0; i < input.length(); i++) {
                sum += input.charAt(i) - '0';
            }
            System.out.println(sum);
        }
    }
}

