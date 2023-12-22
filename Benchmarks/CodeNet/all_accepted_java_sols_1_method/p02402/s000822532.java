import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long min, max, sum;
        min = Long.MAX_VALUE;
        max = Long.MIN_VALUE; 
        sum = 0;
        for (int i = 0; i < n; i++) {
            long a = scanner.nextLong();
            if (min > a) min = a;
            if (max < a) max = a;
            sum += a;
        }

        System.out.println(min + " " + max + " " + sum);
    }
}

