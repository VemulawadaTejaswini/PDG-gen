import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        if(X==0){
            System.out.println(0);
            return;
        }

        long sum = 0;

        long A = X % 500;
        long B = X / 500;

        long C = A % 5;
        long D = A / 5;

        sum += 1000 * B + 5 * D;
        System.out.println(sum);
    }
}