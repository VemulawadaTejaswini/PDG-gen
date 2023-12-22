import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int r = S % 100;
        if (S >= 100 && S < 1300) {
            if (r <= 12 & r != 0) {
                System.out.println("AMBIGUOUS");
            }
            else{
                System.out.println("MMYY");
            }
        }
        else{
            if (r <= 12 & r != 0) {
                System.out.println("YYMM");
            }
            else{
                System.out.println("NA");
            }
        }
    }
}

