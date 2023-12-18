import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());

        int sum = 0;
        for (int i = 1; i < n + 1; i++) {
            int c = 0;
            int j = i;
            while (true) {
                if (j / 10 != 0) {
                    c += j % 10;
                    j = j / 10;
                } else {
                    c += j % 10;
                    if (c >= a && c <= b) {
                        sum += i;
                    }
                    break;
                }
            }
        }
        System.out.println(sum);

    }
}