import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        double debt = 100000.0;
        for(int i = 0; i< new Scanner(System.in).nextInt(); i++) {
            debt = Math.ceil(debt * 0.00105) * 1000.0;
        }
        System.out.println(debt);

    }
} 