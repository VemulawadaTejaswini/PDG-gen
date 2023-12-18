import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num, i, n, max, min, sum;
        num = sc.nextInt();
        max = Integer.MIN_VALUE; min = Integer.MAX_VALUE; sum = 0;
        for (i = 0; i < num; i++) {
            n = sc.nextInt();
            if (n > max) max = n;
            if (n < min) min = n;
            sum += n;
        }
        System.out.println(min + " " + max + " " + sum);
    }
}

