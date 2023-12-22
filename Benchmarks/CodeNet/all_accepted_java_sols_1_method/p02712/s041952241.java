import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer N = input.nextInt();
        String[] a = new String[N+1];
        long sum = 0;

        for (int i = 0; i <= N; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                a[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                a[i] = "Fizz";
            } else if (i % 5 == 0) {
                a[i] = "Buzz";
            } else {
                a[i] = Integer.toString(i);
                sum += i;
            }
        }

        System.out.println(sum);
    }
}