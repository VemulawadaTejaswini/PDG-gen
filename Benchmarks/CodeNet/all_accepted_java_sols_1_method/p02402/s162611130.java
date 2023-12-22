import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            long count = Long.parseLong(scan.nextLine());
            String[] line = scan.nextLine().split(" ");

            long min = Long.parseLong(line[0]);
            long max = Long.parseLong(line[0]);
            long sum = 0;
            long num = 0;

            for (int i = 0; i < count; i++) {
                num = Integer.parseInt(line[i]);
                sum += num;

                if (num < min) min = num;
                if (num > max) max = num;

            }

            System.out.println(min + " " + max + " " + sum);
        }

    }

}

