import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        while (C > 0 && A > 0) {
            C -= B;
            if (C <= 0) {break;}
            A -= D;
        }

        String ans;
        if (C <= 0) {ans = "Yes";}
        else {ans = "No";}

        System.out.println(ans);

        scanner.close();
    }
}