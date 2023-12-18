import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long a = scan.nextInt();
        long result = 1;
        long b = (long)Math.pow(10,18);

        for(int i = 0; i < a ;i++) {
            long number = scan.nextLong();
            result *= number;
        }

        if( result > b) {
            result = -1;
            System.out.println(result);
        }else {
            System.out.println(result);
        }
        scan.close();
    }

}