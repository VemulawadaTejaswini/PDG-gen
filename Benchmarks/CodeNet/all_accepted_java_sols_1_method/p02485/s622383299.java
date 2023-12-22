import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String line = scan.nextLine();
            if (line.equals("0")) {
                break;
            }

            int sum = 0;
            for (char rawnum: line.toCharArray()) {
                int n = rawnum - '0';
                sum += n;
            }
            System.out.println(sum);
        }
    }
}