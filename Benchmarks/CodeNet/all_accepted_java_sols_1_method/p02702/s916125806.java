import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        int count = 0;
        int current = 0;

        int[] mod = new int[2020];
        mod[2019]++;
        mod[0]++;

        int rem = 1;

        for (int i = s.length()-1; i >=0; i--) {

            int a = s.charAt(i) - '0';
            rem *= 10;
            rem %= 2019;

            current = (a*rem + current ) % 2019;

            count+=mod[current];

            mod[current ]++;
        }

        System.out.println(count);
    }
}