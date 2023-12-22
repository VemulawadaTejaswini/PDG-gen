import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        double debt = 100000.0;
        int nWeeks = new Scanner(System.in).nextInt();
        for(int i = 0; i < nWeeks; i++) {
            debt = Math.ceil(debt * 0.00105) * 1000.0;
        }
        System.out.println((int)debt);

    }
} 