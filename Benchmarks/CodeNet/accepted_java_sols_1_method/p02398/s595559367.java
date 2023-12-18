import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        int divisor;
        int count = 0;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        for(divisor = a; divisor <= b; divisor++) {
            if(c % divisor == 0)
                count++;
        }
        System.out.println(count);
    }
}

